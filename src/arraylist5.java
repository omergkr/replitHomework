package replit;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist5 {

    public static void main(String[] args) {

        ArrayList<String> sehir=new ArrayList<>();

        sehir.add("New jersey");
        sehir.add("New york");
        sehir.add("Atlanta");
        sehir.add("Florida");
        sehir.add("Ohio");


        ArrayList<String> s3=new ArrayList<>();

        s3 =rotatelist(sehir);
        System.out.println(s3);



    }

public static ArrayList<String> rotatelist(ArrayList<String> liste){


    Collections.reverse(liste);
    return liste;
}



}
