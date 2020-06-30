package by.tms.controller;

import by.tms.models.User;
import by.tms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping(path = "/user")
public class UserController {
    private final UserService userService;
    private final List<User> userList;

    public UserController(UserService userService, List<User> userList) {
        this.userService = userService;
        this.userList = userList;
    }

    @GetMapping(path = "/reg")
    public String reg() {
        System.out.println(userList);
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
            httpSession.setAttribute("checkAuth", true);
            userList.add(userByLogin);
        } else {
            model.addAttribute("message", "Invalid authorization!");
        }
        return "auth";
    }

    @GetMapping(path = "/logout")
    public String logout(HttpSession httpSession) {
        httpSession.invalidate();
        return "main";
    }
}