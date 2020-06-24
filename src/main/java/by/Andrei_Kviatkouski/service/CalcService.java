package by.Andrei_Kviatkouski.service;

import by.Andrei_Kviatkouski.models.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalcService {

    @Autowired
    private List<Operation> operationsList;

    public double calculator(double num1, double num2, String operation) {
        double result = 0.0;
        switch (operation) {
            case ("sum"):
                result = sum(num1, num2);
                break;
            case ("minus"):
                result = minus(num1, num2);
                break;
            case ("div"):
                result = div(num1, num2);
                break;
            case ("multiply"):
                result = multiply(num1, num2);
                break;
        }
        addHistory(num1, num2, result, operation);
        return result;
    }


    private void addHistory(double num1, double num2, double result, String operation) {
            String symbol = symbol(operation);
            Operation operation1 = new Operation(num1, num2, result, symbol);
            operationsList.add(operation1);
        }


    private String symbol(String operation) {

        switch (operation) {
            case ("sum"):
                return "+";
            case ("minus"):
                return "-";
            case ("div"):
                return "/";
            case ("multiply"):
                return "*";
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }


    public List getHistory() {
        return operationsList;
    }


    private double sum(double num1, double num2) {
        return num1 + num2;
    }

    private double minus(double num1, double num2) {
        return num1 - num2;
    }

    private double div(double num1, double num2) {
        return num1 / num2;
    }

    private double multiply(double num1, double num2) {
        return num1 * num2;
    }
}
