package replit;

import java.util.ArrayList;

public class arraylist7 {

    public static void main(String[] args) {

        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();

        arr1.add(3);
        arr1.add(2);
        arr1.add(5);
        arr1.add(6);

        arr2.add(5);
        arr2.add(8);
        arr2.add(9);

        System.out.println(common_values(arr1,arr2));


    }
    public static ArrayList<Integer> common_values(ArrayList<Integer> liste1,ArrayList<Integer> liste2){

        ArrayList<Integer> ortak=new ArrayList<>();

        for (int i = 0; i <liste2.size() ; i++) {
            for (int j = 0; j <liste1.size() ; j++) {

                if(liste1.get(j)==liste2.get(i))
                    ortak.add(liste1.get(j));


            }
        }

            return  ortak;
        }





    }



