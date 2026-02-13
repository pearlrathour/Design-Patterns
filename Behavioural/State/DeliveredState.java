package Behavioural.State;

public class DeliveredState implements OrderState {

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
        System.out.println("Already delivered.");
    }
}
