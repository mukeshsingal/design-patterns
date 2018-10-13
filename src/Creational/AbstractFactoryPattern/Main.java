package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Factory.DominosFoodChainFactory;
import Creational.AbstractFactoryPattern.Factory.KfcFoodChainFactory;

public class Main {
    public static void main(String[] args) {
        RestaurantWithAbstractFactory dominosChain = new RestaurantWithAbstractFactory(new DominosFoodChainFactory());
        Customer customer = new Customer(dominosChain);
        customer.visitRestaurant();

        System.out.println();

        RestaurantWithAbstractFactory kfcChain =
                new RestaurantWithAbstractFactory(new KfcFoodChainFactory());
        Customer customer1 = new Customer(kfcChain);
        customer1.visitRestaurant();
    }
}
