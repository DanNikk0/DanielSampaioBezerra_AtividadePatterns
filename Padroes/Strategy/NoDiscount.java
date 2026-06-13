package Padroes.Strategy;

public class NoDiscount implements DiscountStrategy {
    public double apply(double subtotal) {
        return subtotal; 
    }
}
