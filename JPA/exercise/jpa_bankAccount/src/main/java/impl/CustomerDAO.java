package impl;

import dao.IBaseDAO;
import entity.BranchBank;
import entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class CustomerDAO implements IBaseDAO <Customer> {
    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;
    private EntityTransaction transaction;

    public CustomerDAO(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
    @Override
    public boolean createAndSave(Customer element) {
        return false;
    }

    @Override
    public boolean update(Customer element) {
        return false;
    }

    @Override
    public Customer getById(Long id) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public List<Customer> getAll() {
        entityManager = entityManagerFactory.createEntityManager();
        List<Customer> customers = entityManager.createQuery("SELECT c FROM Customer c, Customer .class").getResultList();
        entityManager.close();
        return customers;
    }
}
