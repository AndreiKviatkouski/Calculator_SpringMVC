package by.Andrei_Kviatkouski.controller;

import by.Andrei_Kviatkouski.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/main")
public class MainController {
    @GetMapping
    public  String main(@RequestParam(required = false) Double num1,
                        @RequestParam(required = false) Double num2,
                        @RequestParam(required = false) String operation,
                        Model model){
        Double result = Calculator.calculator(num1, num2, operation);
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("operation", operation);
        model.addAttribute("result", result);
        return "main";
    }
}
