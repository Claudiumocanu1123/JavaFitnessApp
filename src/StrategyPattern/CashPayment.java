package StrategyPattern;

public class CashPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Plata in valoare de" + amount + " a fost facut cu ajutorul numerarului");
    }
}
