package OOP.kEnum.Test;

import OOP.kEnum.Domain.Costumer;
import OOP.kEnum.Domain.Costumer.PaymentType;
import OOP.kEnum.Domain.CostumerType;

public class CostumerTest1 {

    public static void main(String[] args) {
        Costumer costumer1 = new Costumer("Roger", CostumerType.EMPLOYEEE, PaymentType.DEBIT);
        Costumer costumer2 = new Costumer("Paola", CostumerType.EMPLOYER, PaymentType.CREDIT);
        System.out.println(costumer1);
        System.out.println(costumer2);
    }

}
