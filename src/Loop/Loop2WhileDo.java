package Loop;

import java.sql.SQLOutput;

/** The do/while loop is a variant of the while loop. This loop will execute the code block once,
 * before checking if the condition is true,
 * then it will repeat the loop as long as the condition is true.
 * Syntax:
 * do {
 *   // code block to be executed
 * }
 * while (condition);
 */
public class Loop2WhileDo {

    public static void main(String[] args) {

    //EXAMPLE 1
        System.out.println("Example 1:");
    int count = 12;
    do {
        System.out.println("less than 12");
    } while (count < 10);
        System.out.println();

    // EXAMPLE 2
        System.out.println("Example 2:");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i <= 5);


    }

}
