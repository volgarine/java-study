package Variables;

/***
 * <a href="https://www.w3schools.com/java/java_type_casting.asp"> <b> Casting</b> </a></>
  */

public class Casting {
    public static void main(VarString[] args) {
          /*
        In Java, casting refers to the process of converting a value from one data type to another.
        This is necessary when you want to assign a value of one data type to a variable of another data type,
        and there is a possibility of data loss or a need for explicit conversion.
        There are two types of casting in Java:

        Widening Casting (automatically) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double

        Narrowing Casting (manually) - converting a larger type to a smaller size type
        double -> float -> long -> int -> char -> short -> byte */

        // Widening Casting
        // Widening casting is done automatically when passing a smaller size type to a larger size type:

        System.out.println("Widening Casting");
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        System.out.println();

        //Narrowing Casting
        //Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        System.out.println("Narrowing Casting");
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

    }
}
