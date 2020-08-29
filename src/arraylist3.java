package replit;

import java.util.ArrayList;

public class arraylist3 {

    public static void main(String[] args) {
        ArrayList<String> sehir=new ArrayList<>();


        sehir.add("New jersey");
        sehir.add("New york");
        sehir.add("Ohio");
        sehir.add("Florida");
        sehir.add("Boston");

        System.out.println(getLength(sehir));
    }

    public static ArrayList<Integer> getLength(ArrayList<String> liste)
    {

        ArrayList<Integer> uzunluk=new ArrayList<>();
        int i=0;
        for (String n:liste)
        {
         uzunluk.add( n.length())   ;
         i++;
        }
        return uzunluk;
    }

}
