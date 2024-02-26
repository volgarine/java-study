package Exercises.ManagementClass;

public class School {
    private String name;
    //private String address;
    private Student[] students;

    public School(String name) {
        this.name = name;
    }

    public School(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }


    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
