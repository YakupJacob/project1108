package hash;

import java.util.HashMap;
import java.util.Map;

public class hash1 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Jacob", 85);
        map.put("aga", 54);
        map.put("Jan", 19);
        map.put("Max", 20);

        System.out.println("Size:" +map);
        HashMap<String, Integer> mapcopy = new HashMap<>(map);
         System.out.println("1.way");
        System.out.println("1.way" + mapcopy);
//      2.way  HashMap<Integer, String> map2 = new HashMap<>();
//        map2= new HashMap<>(map);
//        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
//            Integer key = entry.getKey();
//            String point = entry.getValue();
//            System.out.println(key + " " + point);
//       3.way
//        HashMap<String, Integer> mapcopy = new HashMap<>();
//        mapcopy.putAll(map);
////        System.out.println("1.way" + mapcopy);
//        for (Map.Entry<Integer,String> entry: map.entrySet()){
//            Integer Key = entry.getKey();
//            String


//        }

    }
}
