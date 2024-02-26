package OOP.gAssociation.Test;

import OOP.gAssociation.Domain.School;
import OOP.gAssociation.Domain.Teacher;

public class SchoolTest1 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Xavier");
        Teacher teacher2 = new Teacher("Miyagi");
        Teacher[] teachers = {teacher1, teacher2};
        School school = new School("X-Men",teachers);
        school.print();
    }
}
