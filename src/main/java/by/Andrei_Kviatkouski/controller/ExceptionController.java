package by.Andrei_Kviatkouski.controller;

import by.Andrei_Kviatkouski.service.UserNotFoundException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(IllegalArgumentException.class)
    public String ex(IllegalArgumentException ex, Model model) {
        String message = ex.getMessage();
        model.addAttribute("message", message);
        return "calc";
    }

    @ExceptionHandler(NullPointerException.class)
    public String ex(NullPointerException ex, Model model) {
        String message = ex.getMessage();
        model.addAttribute("message", message);
        return "error";
    }

    @ExceptionHandler(UserNotFoundException.class)
    public String ex(UserNotFoundException ex, Model model) {
        String message = ex.getMessage();
        model.addAttribute("error", message);
        return "userauth";
    }
}
