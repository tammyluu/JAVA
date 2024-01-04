package dao;

import entity.Task;
import entity.User;

import java.util.List;

public interface UserDAO {
    public  boolean addUser(User user);
    public  User findUserByID(Long id);

    public  List<Task> getAllTasksByUser(Long userId);

    public  boolean deleteOneUserAndTasks(Long userId, Long taskId);
}
