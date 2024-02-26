package OOP.hInheritance.Test;

// 0 - Static initialization block of the superclass is executed when the JVM loads the father class
// 1 - Static initialization block of the subclass is executed when the JVM loads the daughter class
// 2 - Memory space allocated to the superclass object
// 3 - Each superclass attribute is created and initialized with default values or whatever is passed
// 4 - Superclass initialization block is executed in the order it appears
// 5 - Constructor is executed from the superclass
// 6 - Memory space allocated to the subclass object
// 7 - Each subclass attribute is created and initialized with default values or whatever is passed
// 8 - Subclass initialization block is executed in the order it appears
// 9 - Constructor is executed from the subclass


import OOP.hInheritance.Domain.Employee;

public class InheritanceTest2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Rock Balboa");
        System.out.println("Initialization: You need to know for the Oracle Certification");
    }
}
