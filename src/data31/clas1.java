package data31;

public class clas1 {
    public static void main(String[] args) {

        int [] items= { 1,2,3,4,5};
        int profit=0;


        for (int i=0; i<items.length-1;i++) {
            if(items[i+1]>items[i]) {



                profit+=(items[i+1]-items[i]);
                // maxProfit  = maxProfit +
            }
        }
        System.out.println(profit);
    }
}


