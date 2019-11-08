package pazartesi114;

import java.util.HashMap;

public class hashmapalishdirma {

                public static void main(String[] args) {
                    HashMap<String, String> map = new HashMap<>();
                    map.put("A", "b");

                    for (int i = 0; i < 3; i++) {
                        System.out.println(map);
                        String value = map.get("A");
                      map.put("A",value+"b");

                    }
                    //output:
                    // ["A", b]
                    // ["A", bb]
                    // ["A", bbb]
                }
            }

