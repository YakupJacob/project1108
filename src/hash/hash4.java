package hash;

import java.util.HashMap;

public class hash4 {


            //4. Write a Java program to remove all
            //   of the mappings from a map.

            public static void main(String[] args) {
                HashMap<Integer, String> map = new HashMap<>();
                map.put(1, "Red");
                map.put(2, "Green");
                map.put(3, "Black");
                map.put(4, "White");
                map.put(5, "Blue");

//                map.clear();
                int key =3;
                System.out.println("Size of map is: " + map.size());
                if (map.containsKey(key)){
                    System.out.println("print yes"+ map.get(key));

                }else{
                    System.out.println("print no");
                }
             //map
                //map.clear()
             if (map.isEmpty()){
                 System.out.println("it is empty");
             }else{
                 System.out.println("not");
             }

        }
}
