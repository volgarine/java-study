package OOP.bMethods.Test;

import OOP.bMethods.Domain.Person;

// example of Encapsulation, private method - Get and Set

public class PersonTest01Encapsulation {
    public static void main(String[] args) {

        Person person = new Person();// reference variable/object
        person.setName("Jiraya");
        person.setAge(170);
        person.city = "Calgary";
        //print option 1: with Method
        person.printPerson();
        //print option 2: without Method
        System.out.println(person.getName());
        System.out.println(person.getAge());
        //System.out.println(person.city); //public atribute
    }


}
