package Creational.BuilderPattern.Example_2;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }

    public abstract void buildBread();

    public abstract void buildSauce();

    public abstract void buildTopping();
}
