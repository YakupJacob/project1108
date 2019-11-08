package clas28;

public class cls5 {
    public static void main(String[] arg){
        int[][] price = {
                {3, 4, 5,},
                {3, 3, 3,},
                {4, 5, 4,},
                {1, 1, 2,},
        };
        for (int i=0; i <price.length;i++){
            int sum= 0;
            for(int j=0; j< price[i].length;j++){
                System.out.print((price[i][j] + " "));
                sum+= price[i][j];
            }
            System.out.println("Sum is:" + sum);
            System.out.println("Ave is:" + sum/3);
            System.out.println();
        }
    }
}
