package StrategyPattern;

public class CardPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("Plata a in valoare de " + amount + " a fost facuta cu ajutorul cardului");
    }
}
