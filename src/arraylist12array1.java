import java.util.Arrays;

public class arraylist12array1 {

    public static void main(String[] args) {

//        duplicate() isminde bir method oluşturun.
//        Parametresi int Array olmalı
//        Return tipi boolean
//        Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
//                Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
//                Örnek1:
//        Input: [1,2,3,1]
//        Output: true
//        Örnek 2:
//        Input: [1,2,3,4]
//        Output: false

int [] numbers={ 1,2,3,4};
        System.out.println(duplicate(numbers));


    }
public static boolean duplicate(int[] arr)
    {
        int a=0;
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1 ;i++) {

            if(arr[i]==arr[i+1])
                a++;
        }
if (a==0)
    return false;
else
    return true;

    }


}
