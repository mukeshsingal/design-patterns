package Behavioral.TemplatePattern;


/**
 * Template Design Pattern is a behaviour pattern which let you
 * Define the skeleton of an algorithm and allow subclasses to
 * redefine certain steps of algorithm without changing its structure.
 */
public class Main {
    public static void main(String[] args) {
        PizzaMaker pizzaMaker = new SimplePizzaMaker();
        pizzaMaker.make();
    }
}
