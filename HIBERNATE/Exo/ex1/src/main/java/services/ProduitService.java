package services;

import dao.DAOInterface;
import models.Produit;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ProduitService extends BaseService  implements DAOInterface<Produit> {
    @Override
    public List<Produit> selectAll() {
        List<Produit> produitList = null;
        Query<Produit> produitQuery = session.createQuery("from Produit");
        produitList = produitQuery.list();
        return produitList;
    }

    @Override
    public Produit selectById(int id) {
        Produit produit = null;
        session = sessionFactory.openSession();
        produit = (Produit) session.get(Produit.class, id);
        session.close();
        return produit;
    }

    @Override
    public boolean addNew(Produit produit) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(produit);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public void update(Produit produit) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(produit);
        session.getTransaction().commit();
        System.out.println("Produit bien modifié");;
    }

    @Override
    public void delete(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Produit p = session.get(Produit.class, id);
        session.delete(p);
        session.getTransaction().commit();
        System.out.println("Votre produit suprimé !!!!");
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





    public void begin(){

        session = sessionFactory.openSession();
    }

    public void end(){

        session.close();
    }

}
