package replit;

import java.util.Arrays;

public class metod14 {


    public static void main(String[] args) {

        int [] arr1={2,4,6};
        int [] arr2={1,2,3,4,5};

        System.out.println(Arrays.toString(append(arr1,arr2)));

    }
    public static int[] append(int[] dizi1,int[] dizi2)
    {

        int a=dizi1.length+dizi2.length;

        int yenidizi[]=new int[a];

        for (int i = 0; i <a; i++) {

            if(i<dizi1.length)
                yenidizi[i]=dizi1[i];
                        else
                yenidizi[i]=dizi2[i-3];

        }

return yenidizi;

    }


}
