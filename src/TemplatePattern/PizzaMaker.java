package TemplatePattern;

public abstract class PizzaMaker {

    public abstract void selectBread();
    public abstract void chooseToppings();
    public abstract void bakeAtTemp();
    public abstract void addCheese();

    public void make(){
        selectBread();
        chooseToppings();
        addCheese();
        bakeAtTemp();
    }
}
