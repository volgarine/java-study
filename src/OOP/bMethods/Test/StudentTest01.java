package OOP.bMethods.Test;


import OOP.bMethods.Domain.PrintStudent;
import OOP.bMethods.Domain.Student;

public class StudentTest01 {
    public static void main(String[] args) {
        // 2 references variables: student01 and student02
        Student student01 = new Student();
        Student student02 = new Student();
        PrintStudent printStudent = new PrintStudent(); // variable printStudent as a method +  Student as reference variable

        student01.name = "Ronaldinho Gaucho";
        student01.age = 43;
        student01.gender = 'M';

        student02.name = "Lionel Messi";
        student02.age = 33;
        student02.gender = 'M';

        printStudent.print(student01);
        printStudent.print(student02);

//        System.out.println(student01.name + "\n" + student01.age + "\n" + +student01.gender);
//        System.out.println("-----------------");
//        System.out.println(student02.name + "\n" + student02.age + "\n" + +student02.gender);

    }
}
