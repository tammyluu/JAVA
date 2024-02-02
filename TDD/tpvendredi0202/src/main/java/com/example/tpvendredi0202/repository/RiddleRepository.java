package com.example.tpvendredi0202.repository;

import com.example.tpvendredi0202.entity.Riddle;
import com.example.tpvendredi0202.utils.HibernateSession;
import org.hibernate.query.Query;

import java.util.List;

public class RiddleRepository extends HibernateSession implements Repository <Riddle> {
    @Override
    public boolean create(Riddle o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.saveOrUpdate(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Riddle o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Riddle o) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Riddle findById(Long id) {
        Riddle riddle = null;
        session = sessionFactory.openSession();
        riddle = session.get(Riddle.class, id);
        session.close();
        return riddle;
    }



    @Override
    public List<Riddle> findAll() {
        List<Riddle> riddles = null;
        session = sessionFactory.openSession();
        Query<Riddle> produitQuery = session.createQuery("from Riddle");
        riddles = produitQuery.list();
        session.close();
        return riddles;

    }
}
