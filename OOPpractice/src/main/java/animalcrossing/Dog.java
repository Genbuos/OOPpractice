package animalcrossing;

public class Dog extends Canine implements Ipet{
    @Override
    public void  printAnimalFood(){
        System.out.println("this dog" + this.getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("barking fr");

    }


    @Override
    public void greet() {
        System.out.println("im a dog");
    }
}
