package pazartesi114;

import java.util.HashMap;
import java.util.Map;

public class alishdirma {
    public static void main(String[] args) {
          int a = 10;
          int b= 3;
          int c = 88;
        HashMap happy = new HashMap();
        happy.put("a",10);
        happy.put("b",3);
        happy.put("c",88);
        System.out.println(happy.get("b"));
        HashMap<Integer,String> fun = new HashMap<Integer, String>();
        fun.put(1,"jacob");
        fun.put(2,"aga");
        fun.put(3,"jan");
//        fun.remove("a");
//        System.out.println(fun.containsValue("jan"));
//        System.out.println(happy.keySet());
        System.out.println(fun.get("1"));
        System.out.println(fun.get(4));
        for(Map.Entry m : fun.entrySet()){
            System.out.println(m.getKey()+ " "+ m.getValue());

        }
        fun.remove(3);
        System.out.print(fun);
    }
}
