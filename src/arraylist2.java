package replit;

import java.util.ArrayList;

public class arraylist2 {

//    getSum() isminde bir method oluşturun.
//    Parametresi ArrayList olmalı
//    Return tipi int olmalı.
//    ArrayList teki tüm sayıları birbiri ile toplayın.
//return olarak toplam sonucu döndürün.Örneğin; Arraylist = 1,2,3,4,5  return 15 olmalı

    public static void main(String[] args) {

        ArrayList<Integer> sayi=new ArrayList<>();

        sayi.add(1);
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);
        sayi.add(5);

        getSum(sayi);

    }
    public static int getSum(ArrayList<Integer> intliste){

        int sum=0;

        for (int n:intliste)
        {
        sum+=n;
        }
        return sum;
    }



}
