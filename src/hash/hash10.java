package hash;

import java.util.HashMap;
import java.util.TreeMap;

public class hash10 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);

        String[][] map2 = {
                {"Apple", "100", },
                {"Lemon", "200",}};
        System.out.println(map2 [1][0] +map2[1][1] );
        System.out.println(map2 [0][0] +map2[0][1] );
//     TreeMap<String,Integer> map3= new TreeMap<>()
    }
}
//    TAHiR ATA, [03.11.19 11:50]
////////        HashMap<Integer, String> map2 = new HashMap<>();
////////        map2= new HashMap<>(map);
////////        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
////////        Integer key = entry.getKey();
////////        String point = entry.getValue();
////////        System.out.println(key + " " + point);
////////
////////        TechnoStudy Inc, [03.11.19 12:17]
////////        package day20_Hashmap;
////////
////////        import java.util.HashMap;
////////        import java.util.Map;
////////
////////public class JavaHashMapTask3 {
////////    //3. Write a Java program to copy all of the
////////    //   mappings from the specified map to another map.
////////
////////    public static void main(String[] args) {
////////        HashMap<Integer, String> map = new HashMap<>();
////////        map.put(1, "Red");
////////        map.put(2, "Green");
////////        map.put(3, "Black");
////////        map.put(4, "White");
////////        map.put(5, "Blue");
////////
////////        System.out.println("map 1: " + map);
////////        HashMap<Integer, String> map2 = new HashMap<>();
//////////        System.out.println("1. way");
//////////        map2 = new HashMap<>(map);
////////
//////////        System.out.println("2. way with .putAll method");
//////////        map2.putAll(map);
////////
////////        System.out.println("3. way with loop");
////////        for (Map.Entry<Integer, String> entry : map.entrySet()) {
////////            Integer key = entry.getKey();
////////            String value = entry.getValue();
////////            //Hint: use .put method
////////            map2.put(key, value);
////////        }
////////        System.out.println("map 2: " + map2);
////////    }
////////}
////////
////////    TechnoStudy Inc, [03.11.19 12:20]
////////        package day20_Hashmap;
////////
////////        import java.util.HashMap;
////////
////////public class JavaHashMapTask4 {
////////    //4. Write a Java program to remove all
////////    //   of the mappings from a map.
////////
////////    public static void main(String[] args) {
////////        HashMap<Integer, String> map = new HashMap<>();
////////        map.put(1, "Red");
////////        map.put(2, "Green");
////////        map.put(3, "Black");
////////        map.put(4, "White");
////////        map.put(5, "Blue");
////////
////////        map.clear();
////////        System.out.println("Size of map is: " + map.size());
////////    }
////////}
////////
////////    Sezai Kalayci, [03.11.19 14:04]
////////        HashMap<Integer, String> map = new HashMap<>();
////////        map.put(1, "Red");
////////        map.put(2, "Green");
////////        map.put(3, "Black");
////////        map.put(4, "White");
////////        map.put(5, "Blue");
////////        int key = 5;
////////        if (map.containsKey(key)) {
////////        System.out.println("Value is " + map.get(key));
////////        } else {
////////        System.out.println("No we don't have");
////////
////////        TechnoStudy Inc, [03.11.19 14:14]
////////        package day20_Hashmap;
////////
////////        import java.util.HashMap;
////////        import java.util.Map;
////////        import java.util.Set;
////////
////////public class JavaHashMapTask11 {
////////    //11. Write a Java program to get a set view of the keys contained in this map.
////////    public static void main(String[] args) {
////////        HashMap<Character, Boolean> map = new HashMap<>();
////////        map.put('A', true);
////////        map.put('B', true);
////////        map.put('C', false);
////////
////////        //print => A B C
////////        Set<Character> characters = map.keySet();
////////        System.out.println(characters);
////////
////////        for (Character character : characters) {
////////            System.out.println(character);
////////        }
////////
////////        //
////////        for (Map.Entry<Character, Boolean> entry : map.entrySet()) {
////////            Character key = entry.getKey();
////////
////////            System.out.println("key is " + key);
////////        }
////////    }
////////}
////////
////////Tuba, [03.11.19 14:28]
////////        [ Photo ]
////////
////////        Sema, [03.11.19 14:28]
////////        int sum=0;
////////        for (Map.Entry< String,Integer> entry : map1.entrySet()) {
////////        Integer value = entry.getValue();
////////        sum+=value;
////////        }
////////        System.out.println("value is " + sum);
////////
////////        Tuba, [03.11.19 14:28]
////////        [In reply to Tuba]
////////        correct?
////////
////////        Jacob Aga, [03.11.19 14:43]
////////        [ Photo ]
////////
////////        Sumeyra, [03.11.19 14:44]
////////        [ Photo ]
////////
////////        Jacob Aga, [03.11.19 15:31]
////////        [ Photo ]
////////
////////        Yunus, [03.11.19 15:39]
////////        [ Photo ]
////////
////////        TechnoStudy Inc, [03.11.19 15:47]
////////        package day20_Hashmap;
////////
////////        import java.util.Collections;
////////        import java.util.HashMap;
////////        import java.util.Map;
////////        import java.util.TreeMap;
////////
////////public class JavaHashMapTask16 {
////////    //16. given map, print it like this:
////////    // Lemon 200
////////    // Apple 100
////////    public static void main(String[] args) {
////////        HashMap<String, Integer> map = new HashMap<>();
////////        map.put("Apple", 100);
////////        map.put("Lemon", 200);
////////
////////        // easiest way
////////        System.out.println("Hardcode..........................................");
////////        System.out.println("Lemon 200");
////////        System.out.println("Apple 100");
////////
////////        System.out.println("Omer Ozdemir......................................");
////////        HashMap<String, Integer> map2 = (HashMap<String, Integer>) map.clone();
////////        for (Map.Entry m : map2.entrySet()) {
////////            System.out.println(m.getKey() + " " + m.getValue());
////////        }
////////        System.out.println("EASY 2..............................................");
////////        //1. use TreeMap, and reverse it
////////        TreeMap<String, Integer> t1 = new TreeMap<>(Collections.reverseOrder());
////////        t1.put("Apple", 100);
////////        t1.put("Lemon", 200);
////////        for (Map.Entry m : t1.entrySet()) {
////////            System.out.println(m.getKey() + " " + m.getValue());
////////        }
////////
////////        //my approach 1
////////        //1. use treeMap
////////        //2. put into 2D array as key-value
////////        //3. print it in reverse
////////
////////        //my approach 2
////////        //1. use treeMap
////////        //2. put key in list and value in list
////////        //3. reverse lists
////////        //4. print lists
////////    }
////////}