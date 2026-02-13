package Behavioural.State;

public class Main {
    public static void main(String[] args) {
        OrderContext order= new OrderContext();

        order.ship();
        order.pay();
        order.ship();
        order.deliver();
        order.pay();    
    }
}
