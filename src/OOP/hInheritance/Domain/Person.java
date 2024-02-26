package OOP.hInheritance.Domain;

public class Person {
    protected String name;
    protected String id;
    protected Address address;

    static {
        System.out.println("Inside of Person Static Initialization Block");
    }

    {
        System.out.println("Inside of Person 1 Initialization Block");
    }

    {
        System.out.println("Inside of Person 2 Initialization Block");
    }

    public Person(String name) {
        System.out.println("Inside of Person Constructor");
        //super();
        this.name = name;
    }

    public Person(String name, String id) {
        this(name);
        this.id = id;
    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println("Address " + this.address.getAddress() + " Postal Code: " + this.address.getPostalCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
