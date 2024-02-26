package OOP.bMethods.Test;

import OOP.bMethods.Domain.Calculator;

public class CalculatorTest05VarArgs {

    public static void main(String...args) {
        Calculator calculator = new Calculator();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum with normal array:");
        calculator.sumArrays(numbers);
        System.out.println("Sum with VarArgs:");
        calculator.sumVarArgs(1, 2, 3, 4, 5, 6, 7);
        // VarArgs it's just a more organized and beautiful way of passing Array
    }


}
