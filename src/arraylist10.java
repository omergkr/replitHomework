package replit;

import java.util.ArrayList;

public class arraylist10 {

    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();

        arr.add(1);
        arr.add(5);
        arr.add(22);
        arr.add(10);
        arr.add(20);
        arr.add(14);
        arr.add(8);
        arr.add(25);
        arr.add(30);
        arr.add(28);

        int min=20;
        int max=30;
        System.out.println(rangeBtw(arr,min,max));

    }

    public static int rangeBtw(ArrayList<Integer> liste,int a,int b)
    {
        int sayac=0;
        for (int n:liste)

        {
            if (n>=a && n<=b)
                sayac++;
        }
       return sayac;

    }

}
