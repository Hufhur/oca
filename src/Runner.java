/**
 * Created by mike on 14/11/15.
 */
public class Runner {


    {
        System.out.println("Runner static init");
    }

    Runner() {
        System.out.println("Runner constructor");
    }

    {
        System.out.println("Runner init");
    }


    public static void main(String[] args) {

        Runner runner = new Runner();

        runner.go();
    }

    private void go() {

//        Animal animal = new Dog();
//        animal.makeSound();
//
//        Dog dog = new Dog();
//        dog.makeSound();
//
//        Animal fish = new Fish();
//        fish.makeSound();
//
//        Fish anotherFish = new Fish();
//        anotherFish.makeSound();
//        anotherFish.move();
//
//        Moveable fish3 = new Fish();
//        fish3.move();
//
//        Horse horse = new Horse();
//        horse.move();
//        horse.makeSound();
//
//        System.out.println("All make sound now...");
//        Animal[] animals = {new Animal(), new Dog(), new Fish(), new Horse()};
//        for (Animal a: animals) {
//            a.makeSound();
//            if (a instanceof Fish)
//                ((Fish) a).move();
//        }


//        Dog dog = new Dog("flee");
//        Wolf wolf = new Dog();

        Dog dog2 =   new Dog();
        dog2.aport();



    }

}
