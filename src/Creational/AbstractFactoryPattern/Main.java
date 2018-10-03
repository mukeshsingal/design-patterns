package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Factory.DominosFoodChainFactory;
import Creational.AbstractFactoryPattern.Factory.KfcFoodChainFactory;

/**
 * 1. Provide an interface for creating families of related or dependent
 * objects without specifying their concrete classes.
 * 2. A hierarchy that encapsulates: many possible "platforms", and the
 * construction of a suite of "products".
 * 3. the new operator considered harmful.
 */
public class Main {
    public static void main(String[] args) {
        RestaurantWithAbstractFactory dominosChain =
                new RestaurantWithAbstractFactory(new DominosFoodChainFactory());
        Customer customer = new Customer(dominosChain);
        customer.visitRestaurant();

        System.out.println();

        RestaurantWithAbstractFactory kfcChain =
                new RestaurantWithAbstractFactory(new KfcFoodChainFactory());
        Customer customer1 = new Customer(kfcChain);
        customer1.visitRestaurant();
    }
}
