package hash;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class hash11 {





                    //17. Given map, update the values
                    // Apple 333
                    // Lemon 444
                    public static void main(String[] args) {
                        HashMap<String, Integer> map = new HashMap<>();
                        map.put("Apple", 100);
                        map.put("Lemon", 200);
                        System.out.println(map);
                        map.put("Apple", 333);
                        map.put("Lemon", 444);
                        System.out.println(map);
                        map.replace("Apple",333,222);
                        System.out.println(map);
                        if (map.containsKey("Apple")){
                            map.put("Apple",500);
                            System.out.print(map);
                        }
    }
}
