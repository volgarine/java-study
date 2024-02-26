package OOP.bMethods.Domain;
// example of Encapsulation, private method - Get and Set
public class Person {
    private String name;
    private int age;
    public String city;

    public void printPerson (){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(city);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if (age <= 0 ){
            System.out.println("INVALID AGE");
            return;
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }


}
