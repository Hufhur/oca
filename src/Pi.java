/**
 * Created by mike on 24/12/15.
 */
public class Pi {

    public static void main(String[] args) {

        boolean isPI;

        for(int fl = 1; fl < 100; fl++) {
            isPI=true;

            for(int x = 2; x < fl; x ++ ) {
                if((fl % x)==0) {
                    isPI = false;
                    break;
                }

            }

            if(isPI) {
                System.out.println(fl + " is PI");
            } else {
                //System.out.println(fl + " is NOT PI");
            }


        }
    }
}
