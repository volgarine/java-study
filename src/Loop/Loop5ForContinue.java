package Loop;

public class Loop5ForContinue {
    public static void main(String[] args) {
        // EXERCISE
        //Given the value of a car, find out how many times it can be paid for in installments
        //Condition valueParcel >= 1000
        double carPrice = 30000;

        for (int installment = (int) carPrice; installment >= 1; installment--){
            double installmentValue = carPrice / installment;
            if (installmentValue < 1000 ){
                continue;// ignore everything below and go back to the loop
            }
            System.out.println("Parcel " + installment + " = CAD$ " + installmentValue);
        }
    }
}
