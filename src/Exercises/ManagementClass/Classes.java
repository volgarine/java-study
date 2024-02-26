package Exercises.ManagementClass;

public class Classes {
    private String name;
    private Student[] students;
    private Address address;

    public Classes(String name) {
        this.name = name;
    }

    public Classes(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public Classes(String name, Student[] students, Address address) {
        this.name = name;
        this.students = students;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
