package data31;

import java.util.Arrays;

public class profit {
    public static void main(String[] args) {
        int x[]= {-99,5,6,3,2,1,7,8,0};
        //Arrays.sort(x,0,9);
        Arrays.sort(x);
        for(int i :x){
            System.out.print(i + ",");
        }
    }
}
