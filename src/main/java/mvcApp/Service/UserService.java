package mvcApp.Service;

import mvcApp.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void add(User user);
    void delete (User user);
    void edit (User user);
    User getById(long id);
     void create(String name, int age);
}
