package OOP.kEnum.Domain;

public class Costumer {
    public enum PaymentType{ //Debit, credit, cheques, prepaid cards, mobile payments and crypto assets
        DEBIT, CREDIT
    }

    private String name;
    private CostumerType costumerType;
    private PaymentType paymentType;

    public Costumer(String name, CostumerType costumerType, PaymentType paymentType) {
        this.name = name;
        this.costumerType = costumerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "name='" + name + '\'' +
                ", costumerType=" + costumerType +
                ", paymentType=" + paymentType +
                '}';
    }
}
