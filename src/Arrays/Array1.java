package Arrays;

public class Array1 {
    public static void main(String[] args) {

        // EXAMPLE 1
        System.out.println("EXAMPLE 1:");
        int[] yearOfBirth = new int[4]; // new = object
        yearOfBirth[0] = 1970;
        yearOfBirth[1] = 1994;
        yearOfBirth[2] = 2000;
        yearOfBirth[3] = 2010;
        System.out.println(yearOfBirth[0]);
        System.out.println(yearOfBirth[1]);
        System.out.println(yearOfBirth[2]);
        System.out.println(yearOfBirth[3]);

        System.out.println();
        // EXAMPLE 2
        System.out.println("EXAMPLE 2:");
        String[] names = new String[4];
        names[0] = "Roger";
        names[1] = "Paola";
        names[2] = "Dodó";
        names[3] = "Caio";

        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

    }
}
