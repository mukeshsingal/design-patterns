package FactoryPattern.main;

import FactoryPattern.products.Animal;

public class PetStore {
    private AnimalFactory factory;

    public PetStore(AnimalFactory factory) {
        this.factory = factory;
    }

    public static void main(String[] args) {
        PetStore petStore = new PetStore(new PetStoreFactory());
        Animal pet = petStore.orderPet("kitty", "Cat");
        pet.makeSound();
        pet.moveAround();
    }

    public Animal orderPet(String petName, String petType){
        return factory.creatAnimal(petName, petType);
    }
}
