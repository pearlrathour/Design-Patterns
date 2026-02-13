package Behavioural.State;

public class ShippedState implements OrderState {

    @Override
    public void pay(OrderContext context) {
        System.out.println("Already paid.");
    }

    @Override
    public void ship(OrderContext context) {
        System.out.println("Already shipped.");
    }

    @Override
    public void deliver(OrderContext context) {
        System.out.println("Delivering order. Moving to DELIVERED state.");
        context.setState(new DeliveredState());
    }
    
}
