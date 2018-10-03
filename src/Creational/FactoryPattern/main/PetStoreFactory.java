package Creational.FactoryPattern.main;

import Creational.FactoryPattern.products.Animal;
import Creational.FactoryPattern.products.Cat;
import Creational.FactoryPattern.products.Dog;

public class PetStoreFactory implements AnimalFactory {
    @Override
    public Animal creatAnimal(String petName, String petType) {
        Animal pet;

        if(petType.equals("Dog")){
            pet = new Dog(petName);
        }
        else if(petType.equals("Cat")){
            pet = new Cat(petName);
        }
        else{
            throw new IllegalArgumentException(petType + "is not valid category");
        }

        return pet;
    }
}
