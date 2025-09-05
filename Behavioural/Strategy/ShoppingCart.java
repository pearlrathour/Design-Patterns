package Behavioural.Strategy;

// Context
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    // Client can set strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Please select a payment method first!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
  
