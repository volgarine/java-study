package Exercises;

import java.util.Scanner;

// How to convert Fahrenheit to Celsius

public class ConvertFahrenheitToCelsius {
    public static void main(String[] args) {

        float temperature;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        temperature = in.nextFloat();
        System.out.println("Celsius: "+ ((temperature-32)* 5/9) + "ºC");

    }
}
