package OOP.bMethods.Test;

import OOP.bMethods.Domain.Calculator;

public class CalculatorTest03Parameter {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Example 1:");
        double result = calculator.divisionTwoNumbers(200, 0);
        System.out.println(result);

        System.out.println("Example 2:");
        double result2 = calculator.divisionTwoNumbers2(200, 0);
        System.out.println(result2);

        System.out.println("Example 3: using VOID");
        double result3 = calculator.divisionTwoNumbers2(200, 0);
        System.out.println(result2);
    }
}
