package ConditionalStructure;

import java.util.Scanner;

public class ConditionIfElse {
    //a condition to check when a person is of legal age OR not and display a message
    public static void main(String[] args) {

        // EXAMPLE 1
        System.out.println("Example 1:");
        if (true) {
            System.out.println("IF TRUE");
        }
        System.out.println();

        // EXAMPLE 2
        System.out.println("Example 2:");
        Scanner scannerAge = new Scanner(System.in); //creates the reader to enter the age
        System.out.println("What is your age?");
        int age = scannerAge.nextInt(); //the value read by the user enters the age variable

        boolean isAdult = age >=18;

        if (age == 18) {
            System.out.println("You are 18, so you can drink beer");
        } else if (age > 18) {
            System.out.println("You are over 18 years of age, so drink beer!");
        } else {
            System.out.println("Drink milk! You are not 18 years old.");
        }
        scannerAge.close();
        System.out.println();

        // TO KNOW
        // ==false is equal !variable
        System.out.println("EXAMPLE 3: ==false is equal !variable");
        if (!isAdult) {
            System.out.println("Drink milk! You are not 18 years old.");
        } else {
            System.out.println("You are 18, so you can drink beer");
        }
    }
}