/**
 * Created by mike on 26/12/15.
 */
public class CheckFood {

    public static void main(String[] args) {

        if(args.length < 1)
            return;

        try{
            check(args[0]);
        }
        catch (BadFoodException e) {
            System.out.println("Bad food");
        }


    }

    private static void check(String f) throws BadFoodException {
        boolean isGood = false;
        String[][] goodFoods = { {"milk", "yogurt"}, { "apple", "peer", "banana"} };
        String[] drinks =  goodFoods[0];

        System.out.println("List of good foods...");

        int categories = goodFoods[0].length;
        int items = goodFoods[1].length;



        for(int x = 0; x < categories; x++) {
            System.out.println(goodFoods[0][x]);
            if (goodFoods[0][x].equals(f)) {
                isGood = true;
            }
        }

        System.out.println("--");

        for (int i = 0; i < items ; i++) {
            System.out.println(goodFoods[1][i]);
            if(goodFoods[1][i].equals(f)){
                isGood=true;
            }
        }


        if(isGood) {
            System.out.println("Good food.");
        } else {
            throw new BadFoodException();
        }
    }
}
