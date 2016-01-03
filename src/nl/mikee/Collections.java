package nl.mikee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mike on 06/11/15.
 */
public class Collections {

    public void run() {

        tryList();
        tryHashMap();

    }

    private void tryHashMap() {
        HashMap<String, String> hm = new HashMap<>();

        hm.put("Pers1", "mike");
        hm.put("Pers2", "piet");


    }

    private void tryList() {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("d");
        list.add("z");
        list.add("b");
        list.add("b");

        for(String s: list)
            System.out.println(s);

    }
}
