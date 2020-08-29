package replit;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist4 {

    public static void main(String[] args) {


        ArrayList<String> renk = new ArrayList<>();


        renk.add("yellow");
        renk.add("red");
        renk.add("blue");
        renk.add("red");
        renk.add("blue");

        String s1 = "blue";
        String s2 = "yellow";


        System.out.println(changelnArraylist(renk, s1, s2));

    }

    public static ArrayList<String> changelnArraylist(ArrayList<String> liste, String str1, String str2) {


        for (int i = 0; i < liste.size(); i++) {

            if (liste.get(i).equals(str1)) {

                liste.remove(i);
                liste.add(i, str2);

            }
        }
            return liste;


    }
}