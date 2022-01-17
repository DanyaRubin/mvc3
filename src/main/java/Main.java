import mvcApp.Service.UserService;
import mvcApp.Service.UserServiceImp;
import mvcApp.model.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService us = new UserServiceImp();
        List<User> messages = us.getAllUsers();
        System.out.println(messages);
    }
}
