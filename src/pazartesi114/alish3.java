package pazartesi114;

import java.util.HashMap;

public class alish3 {

    // put only 'h' letter as keys into your HashMap,
    // put value = 0
    public static void main(String[] args) {
        String sentence = "hello";

        HashMap<Character, Integer> letterMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {
            //  letterMap.put(letter, 0);

            System.out.println(letterMap);

            if (letterMap.containsKey(letter)) {
                System.out.print("i have it");
            } else {
                //System.out.print("i dont have it");
                letterMap.put(letter,0);
            }

        }
        System.out.println(letterMap);
    }
}

