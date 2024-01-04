package impl;

import dao.UserDAO;
import entity.Task;
import entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    private EntityManagerFactory entityManagerFactory;

    public UserDAOImpl(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    @Override
    public boolean addUser(User user) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            em.persist(user);
            transaction.commit();
            return true;
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }

    @Override
    public User findUserByID(Long id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        User user = entityManager.find(User.class, id);
        entityManager.close();
        return user;
    }

    @Override
    public boolean deleteOneUserAndTasks(Long userId, Long taskId) {
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        try {
            transaction.begin();
            User user = em.find(User.class,userId );

            Task task = em.find(Task.class, taskId);
            if  ((user != null) && (task != null)) {
                em.remove(user);
                em.remove(task);
                transaction.commit();
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            em.close();
        }
    }


    @Override
    public List<Task> getAllTasksByUser(Long userId) {
        EntityManager em = entityManagerFactory.createEntityManager();
        User user = em.find(User.class,userId );
        List<Task> tasks = em
                .createQuery("SELECT t FROM Task t WHERE t.user.id = :id", Task.class)
                .getResultList();
        return tasks;
    }



}
