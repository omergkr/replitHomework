import javax.naming.InsufficientResourcesException;
import java.util.*;

public class calisma {


  public static void main(String[] args) {
//
      HashMap<String,Integer> hs = new HashMap<>();
//
//       int x=0;
//
//        String y = " banana ";
//        String z = "  peach ";
//
//        removing(hs, y, z);

      returnValue(hs);
    }


    public static  ArrayList<Integer> returnValue(HashMap<String,Integer> yenimap)  {

    ArrayList<Integer> keyler=new ArrayList<>();

        for (Integer n : yenimap.values())
        {
            keyler.add(n);
        }

return keyler;

    }
}
