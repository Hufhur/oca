/**
 * Created by mike on 27/11/15.
 */
public class Fish extends Animal implements Moveable {

    public void move() {
        System.out.println("Swim swim");
    }

    public void makeSound() {
        System.out.println("blub");
    }

}
