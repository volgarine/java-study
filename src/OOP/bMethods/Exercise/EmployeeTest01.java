package OOP.bMethods.Exercise;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee exEmployee = new Employee();
        exEmployee.setName("Messi");
        exEmployee.setAge(33);
        exEmployee.setSalary(new double[]{1200, 987.32, 2000});
        exEmployee.print();
    }
}
