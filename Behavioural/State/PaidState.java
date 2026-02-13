package Behavioural.State;

public class PaidState implements OrderState {

    @Override
    public void pay(OrderContext context) {
        System.out.println("Already paid.");
    }

    @Override
    public void ship(OrderContext context) {
        System.out.println("Shipping order. Moving to SHIPPED state.");
        context.setState(new ShippedState());
    }

    @Override
    public void deliver(OrderContext context) {
        System.out.println("Cannot deliver. Order not shipped yet.");
    }
    
}
