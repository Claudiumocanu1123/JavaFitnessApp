package StrategyPattern;

public class RevolutPayment implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println(("Plata in valoare de " + amount + " a fost facut prin intermediul revolutului"));
    }
}
