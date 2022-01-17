package mvcApp.controller;

import mvcApp.DAO.UserDao;
import mvcApp.DAO.UserDaoImp;
import mvcApp.Service.UserService;
import mvcApp.Service.UserServiceImp;
import mvcApp.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String printUsers(ModelMap model){
        UserService us = new UserServiceImp();
        List<User> messages = us.getAllUsers();
        model.addAttribute("messages", messages);
        return "users";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }

}
