package services;

import dao.DAOInterface;
import models.Produit;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProduitService extends BaseService  implements DAOInterface<Produit> {
    @Override
    public List<Produit> selectAll() {
        List<Produit> produitList = new ArrayList<>();
        Query<Produit> produitQuery = session.createQuery("from Produit");
        produitList = produitQuery.list();
        end();
        return produitList;
    }

    @Override
    public Produit selectById(int id) {
        Session session = null;
        begin();
        Produit produit = session.get(Produit.class, id);
        session.getTransaction().commit();
        end();
        return produit;
    }

    @Override
    public boolean addNew(Produit produit) {

        Transaction transaction = null;
        try {
            begin();
            session.beginTransaction();
            session.save(produit);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return false;
    }

    @Override
    public void update(Produit produit, int id) {
        Session session = null;
        begin();
        session.beginTransaction();
        Produit p = selectById(id);
        p.setMarque(produit.getMarque());
        p.setReference(produit.getReference());
        p.setDateAchat(produit.getDateAchat());
        p.setPrix(produit.getPrix());
        p.setStock(produit.getStock());
        session.update(produit);
        session.getTransaction().commit();
        end();
        System.out.println("Produit bien modifié");;
    }

    @Override
    public void delete(int id) {
        begin();
        session.beginTransaction();
        Produit p = session.get(Produit.class, id);
        if (p != null){
            session.delete(p);
        }

        session.getTransaction().commit();
        end();
        System.out.println("Votre produit suprimé !!!!");
    }

    @Override
    public List<Produit> searchByPrice(Double prix) {
        begin();
        session.beginTransaction();
        List<Produit> produits = new ArrayList<>();
        Query<Produit> produitQuery = session.createQuery("from Produit where prix >: prix");
        produitQuery.setParameter("prix", prix);
        produits = produitQuery.list();
        return produits;
    }



    @Override
    public List<Produit> getByStock(int stock) {
        Session session = null;
        try {
            begin();
            session.getTransaction().begin();
            List<Produit> produits = new ArrayList<>();
            if (stock > 0) {
                Query<Produit> productQuery = session.createQuery("from Produit where stock < :stock");
                productQuery.setParameter("stock", stock);
                produits = productQuery.list();
                return produits;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            end();
        }
        return null;
    }

    public List<Produit> filterByPrice(double min) throws Exception{
        if (min >= 0){
            Query<Produit> produitQuery = session.createQuery("from Produit where prix >= :min");

            return produitQuery.list();
        }
        throw new Exception("erreur valeur");
    }

    public List<Produit> filterByDate(Date min, Date max) throws Exception{
        if(min.before(max)){

            Query<Produit> produitQuery = session.createQuery("from Produit where dateAchat >= :min and dateAchat <= :max ");
            produitQuery.setParameter("min",min);
            produitQuery.setParameter("max",max);

            return produitQuery.list();
        }
        throw new Exception("erreur date");
    }

    public  List<Double> amountOfStockByBrand(String marque){
        begin();
        session.beginTransaction();
        List<Double> stockList = new ArrayList<>();
        Query<Double> stockQuery = session.createQuery("select  (stock * prix) from Produit where marque like : marque");
        stockQuery.setParameter("marque", marque);
        stockList = stockQuery.list();
        end();
        return stockList;

    }

    public Double calculPriceAverage(){
        //Session session = null;
        try {
            begin();
            session.beginTransaction();
            Query<Double> productQuery = session.createQuery("select avg(prix) from Produit ");
            double prixMoyen = productQuery.uniqueResult();
            return prixMoyen;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            end();
        }
        return null;
    }
    public List<Produit> selectAllByBrand (String marque){
        begin();
        session.beginTransaction();
        List<Produit> produits = new ArrayList<>();
        Query<Produit> productQuery = session.createQuery("from Produit where marque like :marque");
        productQuery.setParameter("marque", marque);
        produits = productQuery.list();
        end();
        return produits;
    }

    public void  removeProductByBrand (String marque){
        begin();
        List<Produit> produits = selectAllByBrand(marque);
        for (Produit p: produits ) {
            session.delete(p);
        }
        session.getTransaction().commit();
        end();
    }

    public void begin(){

        session = sessionFactory.openSession();
        session.beginTransaction();
    }

    public void end(){

        session.close();
    }

}
