package by.Andrei_Kviatkouski;

public class Calculator {
    public static Double calculator(Double a, Double b, String operation) {
        Double result = 0.0;
        switch (operation) {
            case ("sum"):
                result = sum(a, b);
                break;
            case ("minus"):
                result = minus(a, b);
                break;
            case ("div"):
                result = div(a, b);
                break;
            case ("multiply"):
                result = multiply(a, b);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
        return result;
    }

    private static Double sum(Double a, Double b) {
        return a + b;
    }

    private static Double minus(Double a, Double b) {
        return a - b;
    }

    private static Double div(Double a, Double b) {
        return a / b;
    }

    private static Double multiply(Double a, Double b) {
        return a * b;
    }
}
