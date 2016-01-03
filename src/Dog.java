/**
 * Created by mike on 27/11/15.
 */
public class Dog extends Wolf {


    static {
        System.out.println("Dog static init 1");
    }

    String s = " String s";

    {
        System.out.println("Dog init 2" + s);
    }
    Dog(String s) {
        System.out.println("Dog constructor");
    }
    Dog() {
        System.out.println("Dog no-arg construct");
    }


    public void aport() {
        System.out.println("aport");
    }

    static {
        System.out.println("Dog static init 2");
    }
}
