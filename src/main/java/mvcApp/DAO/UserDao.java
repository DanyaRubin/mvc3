package mvcApp.DAO;

import mvcApp.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void add(User user);
    void delete (User user);
    void edit (User user);
    User getById(long id);
    void create(String name, int age);
}
