/**
 * Created by mike on 27/11/15.
 */
public class Animal {
    static {
        System.out.println("Animal static init 1");
    }


    {
        System.out.println("Animal init 2");
    }
    Animal() {
        System.out.println("Animal contructor");
    }

    static {
        System.out.println("Animal static init 2");
    }


}
