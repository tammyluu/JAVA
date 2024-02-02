package com.example.tpvendredi0202.service;

import com.example.tpvendredi0202.Exception.RepositoryException;
import com.example.tpvendredi0202.entity.Riddle;
import com.example.tpvendredi0202.repository.RiddleRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class RiddleService  {
    RiddleRepository riddleRepository;
    SessionFactory sessionFactory;

    public RiddleService(RiddleRepository riddleRepository, SessionFactory sessionFactory) {
        this.riddleRepository = riddleRepository;
        this.sessionFactory = sessionFactory;
    }

    public boolean creatRiddle(String question, String expected, String actual) throws RepositoryException {
        boolean result = false;
        Session session = null;

        try {
            session = sessionFactory.openSession();
            if (session != null) {
                Riddle riddle = Riddle.builder()
                        .question(question)
                        .expectedAnswer(expected)
                        .actualAnswer(actual)
                        .build();
                System.out.println("Before transaction");
                session.beginTransaction();
                System.out.println("After transaction");
                riddleRepository.create(riddle);
                System.out.println("Before commit");
                session.getTransaction().commit();
                System.out.println("After commit");
                result = true;
            } else {
                System.out.println("Session is null");
            }
        } catch (Exception e) {
            if (session != null && session.getTransaction() != null) {
                System.out.println("Before rollback");
                session.getTransaction().rollback();
                System.out.println("After rollback");
            }
            throw new RepositoryException(e);
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return result;
    }



    public Riddle getRiddleById(Long riddleId) throws RepositoryException {
        Session session = sessionFactory.openSession();
        Riddle riddle = null;
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            riddle = riddleRepository.findById(riddleId);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
           throw new RepositoryException(e);
        } finally {
            session.close();
        }
        return riddle;
    }

}
