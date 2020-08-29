package replit;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist11 {

    public static void main(String[] args) {

        Scanner scr=new Scanner(System.in);
        int a=scr.nextInt();

        ArrayList<Integer> asal=new ArrayList<>();

int kontrol=0;

        for (int i = 2; i <=a; i++)

            {
                for (int j = 2; j <i ; j++) {

                    if (i%j==0){
                      kontrol=1;}
                }

                if (kontrol==0){
                    asal.add(i);}
                else
                    kontrol=0;

            }
        System.out.println(asal);
            System.out.println(asal.size());
            if(asal.get(asal.size()-1)==a)
                System.out.println(a+" asal sayidir");
else
                System.out.println(a+" asal sayi degildir");
        }

    }


    //odev

//
//       int [] arr={1,34,5,678,34,56,7,8,};
//            int search=78;
//
//       int [] arr={1,34,5,678,34,56,7,8,};
//       int search=78;
//
//       78 sayisi verilen arrayde var mi?
//                