package OOP.hInheritance.Test;

import OOP.hInheritance.Domain.Address;
import OOP.hInheritance.Domain.Employee;
import OOP.hInheritance.Domain.Person;

public class InheritanceTest1 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setAddress("11 AVE SW");
        address.setPostalCode("A2C D5F");
        Person person = new Person("Roger");
        person.setId("123456789080");
        person.setAddress(address);
        person.print();
        System.out.println();
        Employee employee = new Employee("Caio");
        employee.setId("987654321017");
        employee.setAddress(address);
        employee.setSalary(2500);
        employee.print();
    }
}
