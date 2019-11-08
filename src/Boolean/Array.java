package Boolean;

public class Array {
    public static void main(String[] arg){
    int[] myArray = {2, 11, 45, 9, 56};
                   //0   1   2  3   4
    //i starts with 0 as array index starts with 0 too
        int min = myArray[0];
    //the task is to find and print out the maximum element
        for (int i = 0; i < myArray.length; i++){

            if (myArray[i]<min) {
                //min = myArray[i];
            }

        }
        System.out.println(min);
    }
}
