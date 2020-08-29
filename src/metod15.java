package replit;

import java.util.Arrays;

public class metod15 {


    public static void main(String[] args) {
        int[] list = {3, 8, 12, 2, 1, 17, 43, -8, 46, 203, 14, 97, 10, 4};

        System.out.println(isUnique(list));
    }


public static boolean isUnique(int []  arr)
{
boolean deger=false;
    int [] newarr =new int [arr.length];
            Arrays.sort(arr);

  int  tempVal = Integer.MIN_VALUE;
    int a=0;
    for (int n:arr)
         {
       if (n!=tempVal)

           tempVal=n;

           else {
               a++;}
    }

    if (a>0)
        return false;
    else
        return true;


    }



}

