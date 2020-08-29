package replit;

import javax.swing.*;
import java.util.Scanner;

public class metod12 {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.print("bir sayi giriiz= ");
        int number = scr.nextInt();

        System.out.println( powerOfThree(number));
    }

    public static boolean powerOfThree(int x)
    {
int a=1;
boolean deger=false;
int i=1;
        for ( i = 1; i <x ; i++) {
               a=i*i*i;
            if(a==x){
                 deger=true;break;
           }


        }
        if (i==x)
            deger=false;


return deger;
    }


}
