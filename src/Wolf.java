/**
 * Created by mike on 29/11/15.
 */
public class Wolf extends Animal {


    static {
        System.out.println("Wolf static init 1");
    }


    {
        System.out.println("Wolf init 2");
    }

    Wolf() {
        System.out.println("Wolf constructor");
    }

    static {
        System.out.println("Wolf static init 2");
    }
}
