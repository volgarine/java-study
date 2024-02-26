package OOP.jFinalModifier.Test;

import OOP.jFinalModifier.Domain.Car;
import OOP.jFinalModifier.Domain.Ferrari;

public class CarTest1 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(Car.SPEED_LIMIT);
        System.out.println(car.BUYER);
        car.BUYER.setName("Senna");
        System.out.println(car.BUYER);
        // TIP: Look at Singleton Pattern
        Ferrari ferrari = new Ferrari();
        ferrari.setName("Enzo");
        ferrari.print();
    }
}
