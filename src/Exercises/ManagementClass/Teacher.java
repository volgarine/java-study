package Exercises.ManagementClass;

public class Teacher {
    private String name;
    private String specialty;
    private Classes[] classes;


    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
    }

    public Teacher(String name, String specialty, Classes[] classes) {
        this.name = name;
        this.specialty = specialty;
        this.classes = classes;
    }

    public void print() {
        System.out.println("----- Teacher ----- ");
        System.out.println("- " + this.name);
        if (this.classes == null) return;
        for (Classes aClass : this.classes) {
            System.out.println("----- Classes -----");
            System.out.println("- " + aClass.getName());
            System.out.println("----- Local -----");
            System.out.println("- " + aClass.getAddress().getAddress());
            if (aClass.getStudents() == null || aClass.getStudents().length == 0)
                continue; // continue para a execucao e volta para o começo e o break sai do for, quebra o laço
            System.out.println("----- Students -----");
            for (Student aStudent : aClass.getStudents()) {
                System.out.println("- " + aStudent.getName() + " | Age: " + aStudent.getAge());
            }
        }
    }

    public Classes[] getClasses() {
        return classes;
    }

    public void setClasses(Classes[] classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}