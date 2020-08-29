package replit;

import java.util.ArrayList;

public class arraylist6 {

    public static void main(String[] args) {

        ArrayList<Integer> sayi=new ArrayList<>();
        sayi.add(5);
        sayi.add(4);
        sayi.add(6);
        sayi.add(2);
        sayi.add(1);

        System.out.println(hillNum(sayi));
    }

    public static int hillNum(ArrayList<Integer> liste){

        int kucukbuyuk=0;

        for (int i = 1; i <liste.size()-1 ; i++) {

            if (liste.get(i)<liste.get(i-1)  && liste.get(i)>liste.get(i+1))
                kucukbuyuk=liste.get(i);


        }

        return kucukbuyuk;
    }

}
