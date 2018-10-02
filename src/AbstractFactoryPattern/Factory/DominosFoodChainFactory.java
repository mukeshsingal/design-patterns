package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.products.DominosFoodMenu;
import AbstractFactoryPattern.products.DominosFurniture;
import AbstractFactoryPattern.products.FoodMenu;
import AbstractFactoryPattern.products.Furniture;

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
