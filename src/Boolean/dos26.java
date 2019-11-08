package Boolean;

    public class dos26 {
        public static void main(String[] arg){


                int[] arr1 = {2, 11, 45, 9};

                int[] arr2 = new int[4];
                arr2[0] = 2;
                arr2[1] = 11;
                arr2[2] = 45;
                arr2[3] = 9;


                for (int num : arr1) {
                    System.out.println(num);
                    //1. num = 2;
                    //2. num = 11;
                    //3. num = 45;
                    //4. num = 9;
                }

                System.out.println();

                for (int i = 0; i < arr1.length; i++) {
                    System.out.println("arr1:" + arr1[i]);
                    System.out.println("arr2:" + arr2[i]);
                }
            }
        }



    //Task 1. write a for loop that finds an maximum for the array
    //Task 2. write a for loop that finds an minimum for the array
    //Task 3. write a for loop that finds an average for the array
    // int[] myArray = {34,5,6,2,3,78,1}
    //OUTPUT: average: (34+5+6+2+3+78+1)/7



