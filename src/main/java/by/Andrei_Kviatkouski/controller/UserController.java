package by.Andrei_Kviatkouski.controller;

import by.Andrei_Kviatkouski.service.UserService;
import by.Andrei_Kviatkouski.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }




    @GetMapping(path = "/reg")
    public String reg() {
        return "reg";
    }

    @PostMapping(path = "/reg")
    public String reg(User user, Model model) {
        userService.save(user);
        model.addAttribute("message", "Registration is successful!");
        return "reg";
    }





    @GetMapping(path = "/auth")
    public String auth() {
        return "auth";
    }

    @PostMapping(path = "/auth")
    public String auth(User user, Model model, HttpSession httpSession) {
        User userByLogin = userService.getUserByLogin(user.getLogin());
        if (userByLogin.getPassword().equals(user.getPassword())) {
            model.addAttribute("message", "Authorization is successful!");
            httpSession.setAttribute("user", userByLogin);
        }
        return "auth";

    }







    @GetMapping (path = "/logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "main";
    }
}