package OOP.aClassIntroduction.Test;

import OOP.aClassIntroduction.Domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        // IMPORTANT TO KNOW: Student is a class that has variable behavior.
        // You declare the variable "Student student" and create the object using "NEW" and then the name of the object you want to create
        Student student = new Student();
        student.name = "Roger";
        student.age = 43;
        student.gender = 'M';

        System.out.println(student.name + " \n" + student.age + " \n" + student.gender);

    }
}
