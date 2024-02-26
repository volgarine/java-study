package Operators;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double n1 = scanner.nextDouble();
        System.out.println("Enter number 2: ");
        double n2 = scanner.nextDouble();

        //Sum (+)
        System.out.println("Sum Total: " + (n1 + n2));
        System.out.println();

        //Subtraction total (-)
        System.out.println("Subtraction Total:  " + (n1 - n2));
        System.out.println();

        //Multiplication (*)
        System.out.println("Multiplication Total: " + (n1 * n2));
        System.out.println();

        //Division (/)
        System.out.println("Division Total: " + (n1 / n2));
        System.out.println();

        //Modulus - Rest of Division (%)
        System.out.println("Rest of Division Total: " + (n1 % n2));
        System.out.println();

    }
}
