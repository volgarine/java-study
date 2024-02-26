package OOP.aClassIntroduction.Test;

import OOP.aClassIntroduction.Domain.Teacher;

public class TeacherTest01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Sinclair";
        teacher.age = 30;
        teacher.gender = 'F';

        System.out.println(teacher.name);
        System.out.println(teacher.age);
        System.out.println(teacher.gender);


    }

}
