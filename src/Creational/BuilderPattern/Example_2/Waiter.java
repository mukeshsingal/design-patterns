package Creational.BuilderPattern.Example_2;

/* "Director" */
public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildBread();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }
}
