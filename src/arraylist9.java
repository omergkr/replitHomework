package replit;

import java.util.ArrayList;

public class arraylist9 {

    public static void main(String[] args) {

        int [][] arr= {{1, 2, 3 },  { 4, 5, 6 },  { 7, 8, 9 }};
        ArrayList<Integer> arrlist=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                arrlist.add(arr[i][j]);

            }

        }

        System.out.println(arrlist);

    }
}
