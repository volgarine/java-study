package GoodToKnow;

//Scanner is a class in the java.util package that allows you to read input from various sources
//        such as the console, files, or strings. It provides various methods to read different
//        data types such as int, double, String, and more.

import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // System: is from java.Lang package and in: is InputStream from Java

        System.out.println("\nWhat is your name?");
        String name = scanner.nextLine();

        System.out.println("\nWhat is your age?");
        int age = scanner.nextInt();

        System.out.println("\nWhat is your height? (meters)");
        double height = scanner.nextDouble();

        System.out.println("\nWhat your genre M or F:");
        char genre = scanner.next().charAt(0);

        System.out.println("-----------------------");
        System.out.println("Name: " + name + " | Age: " + age + " | Height: " + height + " | " + "Genre: " + genre);

        System.out.println("Type Hello World:");
        String next = scanner.next(); //next get just the first word, for example, if the user type Hello World, will input just Hello
        System.out.println("scanner.next(): get just the first word: '" + next + "' to get all words typed have to use nexLine()");


    }

}
