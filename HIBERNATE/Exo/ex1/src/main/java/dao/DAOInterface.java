package dao;

import java.util.List;

public interface DAOInterface <T> {

    public List<T> selectAll();

    public T selectById(int id);

    public boolean addNew(T t);

    public void update(T t);

    public void delete(int id);
}
