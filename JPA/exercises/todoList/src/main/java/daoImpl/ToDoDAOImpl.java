package daoImpl;

import dao.ITodoDAO;
import entity.ToDo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class ToDoDAOImpl implements ITodoDAO {
    public  EntityManagerFactory emf;

    public EntityManager em ;
    public EntityTransaction transac ;



    @Override
    public ToDo addAndSaveTask(String title, Boolean complexity) {
        emf = Persistence.createEntityManagerFactory("todo_List");
        em = emf.createEntityManager();
        transac = em.getTransaction();
        transac.begin();

        ToDo toDo = new ToDo();
        em.persist(toDo);
        System.out.println("New Task added: " + toDo.getId() +" "+ toDo.getTitle());
        em.getTransaction().commit();
        em.close();
        emf.close();
        return toDo;
    }

    @Override
    public List<ToDo> getAllTask() {
        em = emf.createEntityManager();
        em.getTransaction().begin();

        return null;
    }

    @Override
    public ToDo getTaskById(int id) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        ToDo toDo = em.find(ToDo.class, id);
        System.out.println("The task with id: " + toDo.getId() + " is: " + toDo.getTitle());
        return toDo;
    }

    @Override
    public ToDo upDateATask() {
        return null;
    }

    @Override
    public boolean deleteATask(int id) {
        return false;
    }
}
