package OOP.bMethods.Exercise;

import java.util.Arrays;

/***
 * 1) Create an Employee class with the following attributes: name, age, salary (three salaries must be saved)
 * 2) Create two methods:  2.1) To print the data, 2.2.) To take the average of salaries and print the result
 */
public class Employee {
    private String name;
    private int age;
    private double[] salary;
    private double average;

    public void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + Arrays.toString(this.salary));

        for (double printSalary : salary) {
            System.out.print(printSalary + " ");
        }
        System.out.println();
        printSalaryAverage();
    }

    public void printSalaryAverage() {
        double average = 0;
        for (double salary : this.salary) { // "for-each" loop, which is used exclusively to loop through elements in an array
            average += salary;
        }
        average /= salary.length;
        System.out.println("Salary Average: " + average);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public double getAverage() {
        return average;
    }

}