package nl.mikee;

/**
 * Created by mike on 04/12/15.
 */
public class Foo {

    public static void main(String[] args) {
        byte c = 1;
        System.out.println("c = " + c);

        c = 127;
        System.out.println("c = " + c);

        c = (byte)200;
        System.out.println("c = " + c);

        byte c2 = c;
        System.out.println("c2 = " + c2);

        int i = 127;
        c = (byte) i;
        System.out.println("c = " + c);






    }
}
