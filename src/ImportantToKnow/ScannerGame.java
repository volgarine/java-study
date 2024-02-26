package ImportantToKnow;

import java.util.Scanner;

public class ScannerGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***** Future Prediction Software *****");
        System.out.println("Enter a question (future) and I will answer yes or no:");
        String question = input.nextLine();
        if (question.charAt(0) == ' ') { // secret: before enter the question, type space to answer be a yes
            System.out.println("YES :)");
        } else {
            System.out.printf("NO :(");
        }
    }
}
