package Creational.AbstractFactoryPattern.Factory;

import Creational.AbstractFactoryPattern.products.DominosFoodMenu;
import Creational.AbstractFactoryPattern.products.DominosFurniture;
import Creational.AbstractFactoryPattern.products.FoodMenu;
import Creational.AbstractFactoryPattern.products.Furniture;

public class DominosFoodChainFactory implements FoodChainFactory {
    @Override
    public FoodMenu createFoodMenu() {
        return new DominosFoodMenu("Dominos Style Food menu");
    }

    @Override
    public Furniture createFurniture() {
        return new DominosFurniture("Dominos Style Furniture");
    }
}
