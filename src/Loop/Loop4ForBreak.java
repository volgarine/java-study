package Loop;

public class Loop4ForBreak {

    public static void main(String[] args) {
        //Print the first 25 numbers from one value. For example, 50
        int maxValue = 50;
        for (int i = 0; i <= maxValue; i++) {
        if (i >25){
            break;
        }
            System.out.println(i);
        }
        System.out.println("Exercice:");
        // EXERCISE
        //Given the value of a car, find out how many times it can be paid for in installments
        //Condition valueParcel >= 1000
        double carPrice = 30000;

        for (int installment = 1; installment <= carPrice; installment++){
            double installmentValue = carPrice / installment;
            if (installmentValue < 1000F ){
                break; //BREAK comes out of FOR
            }
            System.out.println("Parcel " + installment + " = CAD$ " + installmentValue);
        }



    }
}
