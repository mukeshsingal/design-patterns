package Creational.BuilderPattern.Example_2;

public class DominosPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildBread() {
        pizza.setBreadType("Fresh Pan");
    }

    @Override
    public void buildSauce() {
        pizza.setSouce("Mustered");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("Tomato");
    }
}
