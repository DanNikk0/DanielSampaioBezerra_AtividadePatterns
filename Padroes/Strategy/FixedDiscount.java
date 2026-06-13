package Padroes.Strategy;

public class FixedDiscount implements DiscountStrategy {
    private double amount;

    public FixedDiscount(double amount) {
        this.amount = amount;
    }

    public double apply(double subtotal) {
        return Math.max(0, subtotal - amount);
    }
}
