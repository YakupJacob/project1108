package clas29;

public class clas1 {

    public static void main(String[] args) {
           int[] prices = new int []{7,1,5,3,6,4};
           int min = Integer.MAX_VALUE;
           int maxProfit = 0;
           for (int p=0; p<prices.length; p++){
               min = Math.min(min, p);
              int profit = p- min;
               maxProfit = Math.max(maxProfit, profit);
           }
        System.out.println(maxProfit);
    }

}
