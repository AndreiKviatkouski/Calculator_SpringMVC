package by.tms.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Operation {
    private double num1;
    private double num2;
    private double result;
    private String operation;

    public Operation(double num1, double num2, double result, String symbol) {
    }


    @Override
    public String toString() {
        return num1 + " " + operation + " " + num2 + " = " + result;
    }
}

