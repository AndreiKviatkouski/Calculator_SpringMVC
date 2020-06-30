package by.tms.controller;

import by.tms.models.Operation;
import by.tms.models.User;
import by.tms.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/history")
public class HistoryController {

    private final UserService userService;
    private final List<User> userList;

    public HistoryController(UserService userService, List<User> userList) {
        this.userService = userService;
        this.userList = userList;
    }

    @GetMapping
    public String history(Model model, HttpSession httpSession) {
        if (httpSession.getAttribute("history") == null) {
            httpSession.setAttribute("history", new ArrayList<>());
        }
        List<Operation> history = (List<Operation>) httpSession.getAttribute("history");
        model.addAttribute("history", history);
        return "history";
    }
}
