package OOP.bMethods.Domain;

public class Student {
    public String name;
    public int age;
    public char gender;

    // this. takes the variable that was declared here in this class, it is specific.
    public void print() {
        System.out.println("--------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.gender);

    }
}
