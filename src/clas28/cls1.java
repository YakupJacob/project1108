package clas28;

import java.util.Random;

public class cls1 {
    public static void main(String[] arg){
//        Random ran = new Random();
//        int[] arr = new int[10];
//        for (int i=0; i<= arr.length;i++){
//            arr[i] = ran.nextInt(100);
//            System.out.print(arr[i]+" ");
//        }
//        for (int i = arr.length-1; i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
        Random ran = new Random();
        int[] arr = new int[10];
        for (int i =0; i<=arr.length; i++){
            arr[i] = ran.nextInt(10);
            System.out.print(arr[i] +" ");
            if (arr[i] == 0){
                System.out.println("it has zero");
            }
        }
    }
}
