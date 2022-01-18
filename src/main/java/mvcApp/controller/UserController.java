package mvcApp.controller;

import mvcApp.DAO.UserDao;
import mvcApp.DAO.UserDaoImp;
import mvcApp.Service.UserService;
import mvcApp.Service.UserServiceImp;
import mvcApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService us;

    @GetMapping("/users") // все пользователи
    public String printUsers(ModelMap model){
        List<User> messages = us.getAllUsers();
        model.addAttribute("messages", messages);
        return "users";
    }
    @GetMapping("/create")
    public String createNewUser(Model model, @ModelAttribute ("user")User user){
        model.addAttribute("user", user);
        us.add(user);
        return "redirect:/users";
    }



    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("edit");
        return modelAndView;
    }


}
