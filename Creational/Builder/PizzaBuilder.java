package Creational.Builder;

// Builder -> Construction steps common to all builders
public interface PizzaBuilder {
    void buildDough();
    void buildSauce();
    void buildTopping();
    Pizza getPizza();
}


