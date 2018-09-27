package TemplatePattern;

public class SimplePizzaMaker extends PizzaMaker {
    @Override
    public void selectBread() {
        System.out.println("Flat bread Selected");
    }

    @Override
    public void chooseToppings() {
        System.out.println("Added Toppings");
    }

    @Override
    public void bakeAtTemp() {
        System.out.println("Baked at Temp");
    }

    @Override
    public void addCheese() {
        System.out.println("Added cheese");
    }
}
