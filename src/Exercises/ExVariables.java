package Exercises;

/***
 * Create variables for the fields described below between < > and print the following message:
 * I <name>, living at the address ‹address›,
 * I confirm that I received the salary from ‹salario>, on the date ‹date>
 */
public class ExVariables {

    public static void main(String[] args) {

        String name = "Roger";
        String address = "1235 15 AVE SW";
        double salary = 2500.55D;
        String date = "2023/11/23";

        System.out.println("I " + name + " living at the address: " + address +
                " I confirm that I received the salary from " + salary + " on the date " + date);


    }
}
