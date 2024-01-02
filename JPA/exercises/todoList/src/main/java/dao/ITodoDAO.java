package dao;

import entity.ToDo;

import java.util.List;

public interface ITodoDAO {
   public ToDo addAndSaveTask(String title, Boolean complexity);
   public List<ToDo> getAllTask();
   public  ToDo getTaskById(int id);
   public ToDo upDateATask();
   public  boolean deleteATask(int id);
}
