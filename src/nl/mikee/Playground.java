package nl.mikee;

/**
 * Created by mike on 02/01/16.
 */
public class Playground {

    public static void main(String[] args) {

        int x = 0;
        int[] a = new int[10];

        for(;; System.out.println(x)){



            if(x>9) {
                System.out.println("break...");
                break;
            }

         //   System.out.println("add " + x + " to array");
            a[x] = x;
            x++;

        }

        int[][] ab = new int[1][10];
        ab[0] = a;
        ab[0][1] = 100;

        for(int aa: ab[0]) {
            System.out.println(aa);
        }
    }
}
