package replit;

import java.util.Arrays;

public class metod8 {
    public static void main(String[] args) {
        int [] sayi1= {2,4};
        int [] sayi2= {1,2,3,4};


        System.out.println(  Arrays.toString(  nextGreaterElement(sayi1,sayi2  )));
    }

    public static int[] nextGreaterElement(int[] a, int[] b) {

        int [] yeni=new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {

                if (a[i] == b[j]) {
                    if (j == b.length) {
                        yeni[i]=-1;
                    } else if (b[b.length-i-2] > b[j]) {
                        yeni[i] =b[j + 1];
                    } else
                        yeni[i]=-1;;
                }


            }


        }

        return yeni;
    }







}
