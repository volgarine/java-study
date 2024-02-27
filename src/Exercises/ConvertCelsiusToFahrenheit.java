package Exercises;

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float temperature;
        System.out.println("Enter the temperature in Celsius: ");
        temperature = in.nextFloat();
        System.out.println(((temperature*9/5)+32) + "ºF");
    }
}
