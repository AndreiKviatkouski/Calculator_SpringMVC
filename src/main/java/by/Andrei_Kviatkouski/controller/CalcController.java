package by.Andrei_Kviatkouski.controller;

import by.Andrei_Kviatkouski.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/calc")
public class CalcController {
    @Autowired
    private CalcService calcService;


    @GetMapping
    public String form() {
        return "calc";
    }


    @PostMapping
    public String calc(Double num1, Double num2, String operation, Model model) {
        if (num1 != 0 || num2 != 0 || operation != null) {
            Double result = calcService.calculator(num1, num2, operation);
            model.addAttribute("result", result);
        }
        return "calc";
    }
}

