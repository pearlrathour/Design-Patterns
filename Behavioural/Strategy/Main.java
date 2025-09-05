package Behavioural.Strategy;

// Client
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Pay using Credit Card
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876"));
        cart.checkout(1000);

        // Pay using PayPal
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(2000);

        // Pay using UPI
        cart.setPaymentStrategy(new UpiPayment("user@upi"));
        cart.checkout(500);
    }
}
