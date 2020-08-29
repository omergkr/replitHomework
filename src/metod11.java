package replit;

import java.util.Scanner;

public class metod11 {


//Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
//Tek basamaklı çıktığında, döndürün


    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print(" pozitif bir sayi giriiz= ");
        int number = scr.nextInt();
        System.out.println(addDigits(number));

    }

    public static int addDigits(int number) {


        int birler = 0;
        int toplam = 0;
        int sayidegeri = 0;


        do {
            toplam=0;

            birler = number % 10;

            while (number != 0) {
                number /= 10;
                sayidegeri = number % 10;

                toplam = toplam+sayidegeri ;
            }
            toplam+=birler;
            number = toplam;


        } while (toplam > 9);
        return toplam;

    }



}