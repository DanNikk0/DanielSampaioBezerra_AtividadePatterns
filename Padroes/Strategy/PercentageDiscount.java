package Padroes.Strategy;

public class PercentageDiscount implements DiscountStrategy {
    private double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    public double apply(double subtotal) {
        return subtotal * (1 - percent / 100);
    }
    
}
