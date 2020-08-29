import java.util.ArrayList;
import java.util.HashMap;

public class Map2 {

    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<>();


        returnKey(hs);
    }


    public static ArrayList<Integer> returnKey(HashMap<String, Integer> yenimap) {

        ArrayList<Integer> keyler = new ArrayList<>();

        for (Integer n : yenimap.values()) {
            keyler.add(n);
        }

        return keyler;

    }

}







