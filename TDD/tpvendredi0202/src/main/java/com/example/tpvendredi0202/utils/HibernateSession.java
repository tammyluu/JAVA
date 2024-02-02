package com.example.tpvendredi0202.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public  abstract class HibernateSession {
    protected StandardServiceRegistry registre;

    protected SessionFactory sessionFactory;

    protected Session session;
    public HibernateSession(){
        registre = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(registre).buildMetadata().buildSessionFactory();
    }
}
