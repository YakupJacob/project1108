package clas29;

public class clas4 {
    public static void main(String[] args) {
//        we need to use
//        use for loop
        //find out min number
        //found Max between max and price - min.
        int[] prices = new int[]{1, 2, 3, 4, 5};

        //int min = prices[0];//pick any number inside the array
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            min = Math.min(min, p);
            int profit = p - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit);

//
//        for (int p = 0; p < prices.length; p++) {
////            System.out.println(prices[p]);
//            System.out.println(p);
//        }

    }
}