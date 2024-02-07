package org.example.port;

import org.example.entity.Room;

import java.util.List;

public interface IBaseRepository {
    void create(Room room);
    void delete(Room room);
    Room findById(int id);
    List<Room> findAll(String search);

    void update(Room room);
}
