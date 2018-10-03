package Creational.BuilderPattern;

import Creational.BuilderPattern.Example_1.NutritionFacts;
import Creational.BuilderPattern.Example_2.DominosPizzaBuilder;
import Creational.BuilderPattern.Example_2.Pizza;
import Creational.BuilderPattern.Example_2.PizzaBuilder;
import Creational.BuilderPattern.Example_2.Waiter;


/**
 * Separate the construction of a complex object from its representation
 * so that the same construction process can create different representations.
 * Parse a complex representation, create one of several targets.
 */
public class Main {
    public static void main(String[] args) {
        /* Example 1: */
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .fat(20)
                .build();

        /* Example 2: */
        Waiter waiter = new Waiter();
        PizzaBuilder dominosPizzaBuilder = new DominosPizzaBuilder();

        waiter.setPizzaBuilder(dominosPizzaBuilder);
        waiter.constructPizza();

        Pizza pizza = waiter.getPizza();

        System.out.println(pizza.getBreadType());
        System.out.println(pizza.getSource());
    }
}
