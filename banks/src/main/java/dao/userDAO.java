package dao;

import entity.User;

import java.util.List;

public interface userDAO {
    void add(User user);

    List<User> getAll();

    User getById(Long userid);

    void update(User user);

    void remove(User user);
}
