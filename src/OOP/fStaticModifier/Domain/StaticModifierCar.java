package OOP.fStaticModifier.Domain;

public class StaticModifierCar {
    private String name;
    private double maxSpeed;
    private static double speedLimit = 250; // using "Static" this attribute now belongs to the class and no longer to the object

    public StaticModifierCar(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.speedLimit = speedLimit;
    }

    public void print() {
        System.out.println("----------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Max Speed: " + maxSpeed);
        System.out.println("Speed Limit: " + speedLimit);
    }

    public static double getSpeedLimit() {
        return StaticModifierCar.speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        StaticModifierCar.speedLimit = speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
