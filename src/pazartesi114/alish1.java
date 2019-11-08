package pazartesi114;

import java.util.HashMap;

public class alish1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 0);
        String sentence = "ABC";
        for (char c : sentence.toCharArray())  {
            System.out.println(map);
            Integer value = map.get("A");
            map.put("A",value+2);

        }
        //output:
        // ["A", b]
        // ["A", bb]
        // ["A", bbb]
    }
}


