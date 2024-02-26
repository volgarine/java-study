package OOP.bMethods.Domain;

public class Calculator {
    public void sumTwoNumbers() {
        System.out.println(10 + 10);
    }

    public void subtractTwoNumbers() {
        System.out.println(2023 - 1980);
    }

    //Parameter
    public void multiplicationTwoNumber(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    // EXAMPLE 1: Suggestion for better usability
    public double divisionTwoNumbers(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    // EXAMPLE 2
    public double divisionTwoNumbers2(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    // Example with VOID
    public void divisionTwoNumbers3(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Division for 0 is not exist");
            return;
        }
        System.out.println(num1 / num2);
    }

    // Changing values
    // original variable never be changed
    public void changeTwoNumbers(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Inside changeTwoNumbers method - Calculator.java:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    //comparison of methods ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    public void sumArrays(int[] numbers) {
    int sum = 0;
    for (int num : numbers){
        sum += num;
    }
        System.out.println(sum);
    }
    // Methods: VarArgs
    public void sumVarArgs(int... numbers){
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }
        System.out.println(sum);
    }



}
