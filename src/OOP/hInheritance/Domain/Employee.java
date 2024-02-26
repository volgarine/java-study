
package OOP.hInheritance.Domain;

public class Employee extends Person {
    private double salary;
    static {
        System.out.println("Inside of Employee Static Initialization Block");
    }

    {
        System.out.println("Inside of Employee 1 Initialization Block");
    }

    {
        System.out.println("Inside of Employee 2 Initialization Block");
    }
    public Employee(String name) {
        super(name);
        System.out.println("Inside of Employee Constructor");
    }

    @Override
    public void print() { //after to print from Person class will print below
        super.print();
        System.out.println(this.salary);
    }

    public void paymentReport() {
        System.out.println("I " + this.name + " received the salary: ");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
