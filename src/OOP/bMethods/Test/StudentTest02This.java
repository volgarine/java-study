package OOP.bMethods.Test;

import OOP.bMethods.Domain.Student;

public class StudentTest02This {
    public static void main(String[] args) {
        Student student01 = new Student();
        Student student02 = new Student();

        student01.name = "Ronaldinho Gaucho (this.)";
        student01.age = 43;
        student01.gender = 'M';

        student02.name = "Lionel Messi (this.)";
        student02.age = 33;
        student02.gender = 'M';

        student01.print();
        student02.print();
    }

}
