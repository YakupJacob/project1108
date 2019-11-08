package Boolean;

public class home1 {
    public static void main(String[] ars){
        int [] myArray = {34,5,6,2,3,78,1};
        int max = myArray[0];
        int min = myArray[0];
        int sum = 0;
        for (int i=0; i< myArray.length; i++){
            sum = sum + myArray[i];
            System.out.println(myArray[i]);
            if (myArray[i]>max){
             max = myArray[i]; }
            if (myArray[i]<min){
                min = myArray[i];
            }
        }
        System.out.println("The max:" + max);
        System.out.println("The min:" + min);
//        System.out.println(myArray.length);
        System.out.println(sum/myArray.length);
    }
}
