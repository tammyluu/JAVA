package dao;

import models.Produit;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class ProduitDAO implements DAOInterface <Produit> {
    StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
    SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    Session session = sessionFactory.openSession();



    @Override
    public List<Produit> selectAll() {
        Query<Produit> produitQuery = session.createQuery("from Produit");
        List<Produit> list = produitQuery.list();
        for (Produit p: list) {
            System.out.println( p);
        }
        return list;
    }

    @Override
    public Produit selectById(int id) {
       Produit produit = session.get(Produit.class, id);
        return produit;
    }

    @Override
    public boolean addNew(Produit produit) {
        session.beginTransaction();
        try {

            session.saveOrUpdate(produit);
            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
                ex.printStackTrace();
            }
            return false;
        } finally {
            session.close();
            sessionFactory.close();
        }

    }


    @Override
    public void update(Produit produit) {
        session.update(produit);
        System.out.println("Votre produit est bien modifié: " + produit);
        session.close();
        sessionFactory.close();

    }

    @Override
    public void delete(int id) {
       Produit p = session.load(Produit.class, id);
       session.delete(p);
        System.out.println("Votre produit suprimé !!!!");

    }
}
