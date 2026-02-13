package Behavioural.State;

public interface OrderState {
    void ship(OrderContext context);
    void pay(OrderContext context);
    void deliver(OrderContext context);
}
