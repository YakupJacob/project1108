package data31;

public class alishdirma {

    //Task 1. write a for loop that finds an maximum for the array

    //Task 2. write a for loop that finds an minimum for the array

    //Task 3. write a for loop that finds an average for the array

    // int[] myArray = {34,5,6,2,3,78,1}

    //OUTPUT: average: (34+5+6+2+3+78+1)/7


    public static void main(String[] args) {

        int[] myArray = {34, 5, 6, 2, 3, 78, 1};


        System.out.println("TASK1-------------------------------------");
        System.out.println(Integer.MIN_VALUE);
        int max = 0;
        for (int i = 0; i < myArray.length; i++) {
           // int currentNumber = myArray[i];

            if (myArray[i] > max) {

                max = myArray[i];

            }

        }
        System.out.println("max =" + max);

        System.out.println("TASK1-------------------------------------");
        System.out.println(Integer.MAX_VALUE);
        int Min = Integer.MAX_VALUE;
        for (int i=0;i<myArray.length;i++ ){
            int currentNumber= myArray[i];
            if(currentNumber<Min){
                Min=currentNumber;

            }
        }
        System.out.print("max =" + Min);
    }
}
