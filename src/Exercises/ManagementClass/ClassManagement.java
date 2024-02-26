package Exercises.ManagementClass;

/**
 * Create a system that manages classes
 * The system must register classes, students, teachers and the location where it will be held
 * - A student can only be in one class
 * - A class can have none or several students
 * - A teacher can have several classes
 * - A class must have a location
 * <p>
 * Basic fields (excluding relationship)
 * - Class: title
 * - Student: name and age
 * - Teacher: name, specialty
 * - local: address
 */
public class ClassManagement {
    public static void main(String[] args) {
        Address address = new Address("X-Men School - 123 Mountain X AVE SW");
        Student student1 = new Student("Wolverine", 43);
        Student student2 = new Student("Ciclops", 24);
        Student student3 = new Student("Beast", 60);
        Teacher teacher = new Teacher("Professor Xavier", "Telepathy");
        Student[] studentsInTheClass = {student1, student2, student3};
        Classes classes = new Classes("How to get into the mind", studentsInTheClass, address);
        Classes classes2 = new Classes("How to control anger", studentsInTheClass, address);
        Classes[] availableClasses = {classes, classes2};
        teacher.setClasses(availableClasses);
        teacher.print();
    }
}
