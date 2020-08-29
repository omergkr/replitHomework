package replit;

public class metod9 {

    public static void main(String[] args) {

        String s = "abcde";
        String t = "abcd";

        System.out.println(olmayaneleman(s, t));

    }
    public static char olmayaneleman(String a, String b) {
        char cikti = 'a';
        for (int i = 0; i < a.length(); i++) {

            if (!b.contains(String.valueOf(a.charAt(i))))
                cikti = a.charAt(i);


        }
        return cikti;


    }
}
