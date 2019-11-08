package clas28;

public class cls4 {
    public static void main(String[] args) {
        boolean havetwo = false;
        boolean haveone = false;
        int arr[] = {1,7,4,5,2};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==2 ) {
                havetwo = true;
            }
            if (arr[i]==1){
                haveone = true;
            }
        } if (havetwo && haveone){
            System.out.println("you have 1 and 2 in array");
        } else {
            System.out.println("you dont have");

        }
    }
}
