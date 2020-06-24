package by.Andrei_Kviatkouski.controller;

import by.Andrei_Kviatkouski.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(path = "/history")
public class HistoryController {

    @Autowired
    private CalcService calcService;

    @GetMapping
    public String history(Model model) {
        List history = calcService.getHistory();
            model.addAttribute("history", history);
            return "history";
        }
    }
