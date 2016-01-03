package nl.mikee;

/**
 * Created by mike on 10/12/15.
 */
public class Aap {

    public static void main(String[] args) {
        int mask = 0;
        int count = 0;

        if( ( (5<7) || (++count < 10) ) | mask++ < 10) mask = mask + 1;
        System.out.println(mask);




        System.out.println(mask + " " + count);


    }
}
