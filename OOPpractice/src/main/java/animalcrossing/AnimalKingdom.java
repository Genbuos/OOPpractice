package animalcrossing;


public class AnimalKingdom {
    public static void main(String[] args) {






        Dog dog1 = new Dog();
        Cat cat = new Cat();

        Animal[] arrayOfAnimals = new Animal[2];
        arrayOfAnimals[0] = dog1;
        arrayOfAnimals[1] = cat;

        Animal.PrintAnimalNoiseAndWhatTheyEat(arrayOfAnimals);






    }
}
