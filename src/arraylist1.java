package replit;

import java.util.ArrayList;

public class arraylist1 {
//    ismi getCount() olan bir method oluşturun.
//    Parametre olarak bir String ArayList  ve  bir tane String
//    Return tipi int olmalı
//    ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//    Örneğin;ArrayList = Orange , Kiwi , Peach , Banana , Orange
//    String Orange:
//    Count = 2 olmalı. (Orange 2 kez yazılmış)


    public static void main(String[] args) {

        ArrayList<String> liste=new ArrayList<>();

        liste.add("Orange");
        liste.add("Kiwi");
        liste.add("Peach");
        liste.add("Banana");
        liste.add("Orange");

      String meyve="Orange";
        getCount(liste,meyve);

        System.out.println(getCount(liste,meyve));

    }
public static int getCount(ArrayList<String> dizi,String b){

        int tekrarsayisi=0;
    for (String n:dizi) {
       if(n.equals(b))
           tekrarsayisi++;
    }
        return tekrarsayisi;
}

}
