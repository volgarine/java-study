package OOP.fStaticModifier.Test;

import OOP.fStaticModifier.Domain.StaticModifierCar;

public class StaticModifierCarTest {
    public static void main(String[] args) {
        StaticModifierCar.setSpeedLimit(290); // now the variable value will be set for all

        StaticModifierCar car1 = new StaticModifierCar("Toyota Supra", 280);
        StaticModifierCar car2 = new StaticModifierCar("Porsche GT3", 300);
        StaticModifierCar car3 = new StaticModifierCar("Corvette", 290);

        car1.print();
        car2.print();
        car3.print();
    }
}
