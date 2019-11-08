package hash;

import java.util.HashMap;
import java.util.Map;

public class hash5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

//                map.clear();
        if(map.containsValue("Black")){
            System.out.println("Print 3");
        }else{
            System.out.println("not");
        }
        for(Map.Entry<Integer,String>entry: map.entrySet()) {
            String entryValue = entry.getValue();
            Integer entryKey = entry.getKey();
            if(entryValue.equals("Blue")){
                System.out.println("key is" + entryKey);
            }
        }
    }
}
