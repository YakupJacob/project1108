package Boolean;

import java.util.Random;

public class cls4 {
    public static void main(String[] arg) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(10);
            System.out.println(arr[i] + "");
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + "");
        }
    }
}
