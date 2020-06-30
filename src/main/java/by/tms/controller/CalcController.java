package by.tms.controller;

import by.tms.models.Operation;
import by.tms.models.User;
import by.tms.service.CalcService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/calc")
public class CalcController {


    private final CalcService calcService;
    private final List<User> user;

    public CalcController(CalcService calcService, List<User> user) {
        this.calcService = calcService;
        this.user = user;
    }

    @GetMapping
    public String form() {
        System.out.println(user);
        return "calc";
    }


    @PostMapping
    public String calc(double num1, double num2, String operation, Model model, HttpSession httpSession) {
        if (num1 != 0 || num2 != 0 || operation != null) {
            double result = calcService.calculator(num1, num2, operation);
            if (httpSession.getAttribute("history")==null){
                httpSession.setAttribute("history", new ArrayList<>());
            }
            List<Operation> history = (List<Operation>) httpSession.getAttribute("history");
            Operation operation1 = new Operation(num1, num2, result,calcService.symbol(operation));
            history.add(operation1);
            model.addAttribute("result", result);
        }
        return "calc";
    }
}

