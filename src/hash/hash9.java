package hash;

import java.util.HashMap;
import java.util.Map;

public class hash9 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("lime", 50);
        map.put("Orange", 25);
        map.put("Melon", 15);
//        for(Map.Entry<String,Integer> row:map.entrySet()){
//            String key = row.getKey();
//            Integer value = row.getValue();
//            System.out.print(key +" " + vales);
//        //}
        System.out.println(map);
    }
}
