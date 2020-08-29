package replit;

import java.util.Scanner;

public class metod10 {
    public static void main(String[] args) {

        Scanner scr=new Scanner(System.in);
        int n=scr.nextInt();

        System.out.println(fibonacciseri(n));

    }
    public static int fibonacciseri(int n) {


        int toplam = 0;
        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {

            fib[i] = fib[i - 2] + fib[i - 1];


        }
        return fib[n-1];


    }

}
