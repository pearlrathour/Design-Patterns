package Behavioural.State;

public class NewState implements OrderState {

    @Override
    public void pay(OrderContext context) {
        System.out.println("Payment successful. Moving to PAID state.");
        context.setState(new PaidState());
    }

    @Override
    public void ship(OrderContext context) {
        System.out.println("Cannot ship. Order not paid yet.");
    }

    @Override
    public void deliver(OrderContext context) {
        System.out.println("Cannot deliver. Order not shipped yet.");
    }
}
