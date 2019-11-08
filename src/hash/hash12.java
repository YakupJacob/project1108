package hash;

import java.util.HashMap;
import java.util.HashSet;

public class hash12 {
    public static void main(String[] args) {
        HashMap<Character,Integer>map = new HashMap<>();
        String s = "BECOME A SOFTWAER TESTER IN 6 MONTHS";
        char[] c= s.toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.println(s.charAt(i));

            HashSet<Character> set2 = new HashSet<>();
            char[] a= s.toCharArray();
           for (int b=0; b<a.length;b++){

               set2.add(a[b]);
           }
           System.out.println(set2);
        }
    }
}
