package Behavioural.State;

public class OrderContext {
    private OrderState state;

    public OrderContext() {
        this.state = new NewState();
    }

    public void setState(OrderState state) {
        state = state;
    }

    public void ship() {
        state.ship(this);
    }

    public void pay() {
        state.pay(this);
    }

    public void deliver() {
        state.deliver(this);
    }
}
