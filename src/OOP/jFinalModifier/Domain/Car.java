package OOP.jFinalModifier.Domain;

// Primitive Type: Constant Attributes
// Constant Declaration = Uppercase and Underline to separate. EX: SPEED_LIMIT
public class Car {
    private String name;
    public static final double SPEED_LIMIT = 300; // using "Static", this attribute now belongs to the class and no longer to the object
    public final Buyer BUYER = new Buyer();

public final void print(){
    System.out.println("Car: " + this.name);
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
