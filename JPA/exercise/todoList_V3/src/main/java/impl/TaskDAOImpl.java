package impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import entity.Task;
import org.example.dao.TaskDAO;

import entity.TaskInfo;

public class TaskDAOImpl implements TaskDAO {

  private EntityManagerFactory entityManagerFactory;

  public TaskDAOImpl(EntityManagerFactory entityManagerFactory) {
    this.entityManagerFactory = entityManagerFactory;
  }

  @Override
  public boolean addTask(Task task) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    try {
      transaction.begin();
      entityManager.persist(task);
      transaction.commit();
      return true;
    } catch (Exception e) {
      if (transaction.isActive()) {
        transaction.rollback();
      }
      e.printStackTrace();
      return false;
    } finally {
      entityManager.close();
    }
  }

  @Override
  public List<Task> getAllTasks() {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    List<Task> tasks = entityManager
      .createQuery("SELECT t FROM Task t", Task.class)
      .getResultList();
    entityManager.close();
    return tasks;
  }

  @Override
  public boolean deleteTask(Long taskId) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    try {
      transaction.begin();
      Task task = entityManager.find(Task.class, taskId);
      if (task != null) {
        entityManager.remove(task);
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
      entityManager.close();
    }
  }

  @Override
  public boolean markTaskAsCompleted(Long taskId) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    try {
      transaction.begin();
      Task task = entityManager.find(Task.class, taskId);
      if (task != null) {
        task.setCompleted(true);
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
      entityManager.close();
    }
  }

  

  public Task findTaskById(Long taskId) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Task task = entityManager.find(Task.class, taskId);
    entityManager.close();
    return task;
  }

  public boolean updateTask(Task task) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    try {
      transaction.begin();
      entityManager.merge(task);
      transaction.commit();
      return true;
    } catch (Exception e) {
      if (transaction.isActive()) {
        transaction.rollback();
      }
      e.printStackTrace();
      return false;
    } finally {
      entityManager.close();
    }
  }

  public boolean updateTaskInfo(TaskInfo taskInfo) {
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    try {
      transaction.begin();
      entityManager.merge(taskInfo);
      transaction.commit();
      return true;
    } catch (Exception e) {
      if (transaction.isActive()) {
        transaction.rollback();
      }
      e.printStackTrace();
      return false;
    } finally {
      entityManager.close();
    }
  }
}
