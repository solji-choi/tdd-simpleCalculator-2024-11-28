package com.ll;

public class SimpleCalculator {
    public int run(String calculation) {
        String[] calculationBits = calculation.split(" ");
        int num1 = Integer.parseInt(calculationBits[0]);
        int num2 = Integer.parseInt(calculationBits[2]);

        try {
            switch (calculationBits[1]) {
                case "+" :
                    return plus(num1, num2);
                case "-" :
                    return minus(num1, num2);
                case "*" :
                    return multifly(num1, num2);
                case "/" :
                    return divide(num1, num2);
                default:
                    return 0;
            }

        } catch (Exception  e) {
            throw new RuntimeException(e);
        }
    }

    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    public int multifly(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }
}
