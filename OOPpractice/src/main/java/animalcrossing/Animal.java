package animalcrossing;

public abstract class Animal {


        protected String food;



        public Animal(){ }

        public String getFood() {
            return food;
        }

        public void setFood(String food) {
            this.food = food;
        }

        public void printAnimalFood(){
            System.out.println("Animal eats " + food);
        }
        //Behaviors
        public static String  eat(){
            return "What an animal eats";

        }

        public abstract void makeNoise();
        // Overload method.
        public void  makeNoise( String noise){
            System.out.println("making sense " + noise);
        }



        //Polymorphic method
        public static void PrintAnimalNoiseAndWhatTheyEat(Animal[] listOfAnimal){
//    //Enhanced for loop through
//        for(Animal animal : listOfAnimal){
//            animal.makeNoise();
            for (int x = 0; x < listOfAnimal.length; x++ ){
                listOfAnimal[x].makeNoise();
                listOfAnimal[x].eat();
            }
        }





    }

