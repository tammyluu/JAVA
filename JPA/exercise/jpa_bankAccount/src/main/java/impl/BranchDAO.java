package impl;

import dao.IBaseDAO;
import entity.BranchBank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class BranchDAO implements IBaseDAO<BranchBank> {
    private EntityManager entityManager;
    private EntityManagerFactory entityManagerFactory;
    private EntityTransaction transaction;

    public BranchDAO(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }




    public boolean createAndSave(BranchBank element) {
        entityManager = entityManagerFactory.createEntityManager();
        transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(element);
            transaction.commit();
            return true;
        }catch (Exception e){
            if(transaction.isActive()){
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }finally {
            entityManager.close();
        }
    }

    @Override
    public boolean update(BranchBank element) {
        return false;
    }





    @Override
    public BranchBank getById(Long id) {
        return null;
    }

    @Override
    public boolean deleteById(Long id) {
        return false;
    }

    @Override
    public List getAll() {
        entityManager = entityManagerFactory.createEntityManager();
        List<BranchBank> branchBankList = entityManager.createQuery("SELECT b FROM BranchBank b, BranchBank.class").getResultList();
        entityManager.close();
        return branchBankList;
    }
}
