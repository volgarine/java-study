package ConditionalStructure;

/*
There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.
It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

variable = (condition) ? expressionTrue :  expressionFalse;
 */

public class TernaryOperator {

    public static void main(String[] args) {
        System.out.println("variable = (condition) ? expressionTrue :  expressionFalse;");
        int age = 15;
        String result = (age >= 18) ? "Adult" : "Young";
        System.out.println(result);
    }
}
