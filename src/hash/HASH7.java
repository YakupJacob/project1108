package hash;

import java.util.HashMap;
import java.util.Map;

public class HASH7 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple",100);
        map.put("Lemon", 200);
        map.put("lime",50);
        map.put("Orange", 25);
        map.put("Melon", 15);
        int sum=0;
        for(int value:map.values()){
            sum+=value;
        }
        System.out.println("Sum items1" + sum);
          for(Map.Entry<String,Integer>e :map.entrySet()){
//              int price = e.getValue();
          }
    }
}