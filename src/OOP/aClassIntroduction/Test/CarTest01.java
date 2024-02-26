package OOP.aClassIntroduction.Test;
import OOP.aClassIntroduction.Domain.Car;


// EXERCISE:
// 1) Create a car class with the following attributes: name, model and year of manufacture.
// 2) Create 2 objects
// 3) Print the values

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.name = "Toyota";
        car1.model = "Corolla";
        car1.year = 2020;

        car2.name = "Honda";
        car2.model = "Civic";
        car2.year = 2023;

        //car2 = car1; This is a Reference object, but

        System.out.println("CARRO 1: \n" + car1.name + " / " + car1.model + " / " + car1.year);
        System.out.println("CARRO 2: \n" + car2.name + " / " + car2.model + " / " + car2.year);


    }
}
