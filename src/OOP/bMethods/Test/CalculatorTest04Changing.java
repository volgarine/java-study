package OOP.bMethods.Test;

import OOP.bMethods.Domain.Calculator;

public class CalculatorTest04Changing {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int num1 = 1;
        int num2 = 2;
        calculator.changeTwoNumbers(num1, num2);
        System.out.println("Inside CalculatorTest04Changing.java:");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
}
