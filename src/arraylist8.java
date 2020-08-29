package replit;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist8 {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(5);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(7);


        System.out.println(secondMax(arr));


    }
    public static int secondMax(ArrayList<Integer> liste){
        Collections.sort(liste);

return liste.get(liste.size()-2);
    }


}
