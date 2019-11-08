package novem5;

import java.security.KeyStore;
import java.util.HashMap;

public class clas3 {
    public static void main(String[] arg){
        //    5. Write a Java method to count all words in a string. Go to the editor

//    Test Data:

//    Input the string: The quick brown fox jumps over the lazy dog.

//    Expected Output:

//

//    Number of words in the string: 9

        //advanced, put in a new class and call the method from the class.
       // HashMap<Character,Integer> map = new HashMap<>();
        String sen = "The quick brown fox jumps over the lazy dog.";
       // char[] c = s.toCharArray();
       // for (int i=0;i<=s.; i++){



        HashMap<Character, Integer> letterMap = new HashMap<>();

        char[] senArray = sen.toCharArray();
        for (char letter : senArray) {
         //   Integer key = entry.getKey();

          //  String key = row.getKey();
            //letterMap.put(letter, getKey);
        }
        System.out.println(letterMap);
        // {h=0}
            System.out.println(sen.charAt(19));
        }
    }




