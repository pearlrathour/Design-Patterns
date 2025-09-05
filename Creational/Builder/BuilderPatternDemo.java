package Creational.Builder;

// Client
public class BuilderPatternDemo {
    public static void main(String[] args) {
        Cook cook = new Cook();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        cook.setPizzaBuilder(hawaiianPizzaBuilder);
        cook.constructPizza();

        Pizza pizza = cook.getPizza();
        System.out.println(pizza);
    }
}
