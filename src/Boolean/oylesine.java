package Boolean;

public class oylesine {
    public static void main(String[] arg) {

        int[] xyz = {2, 11, 45, 9, 56};

        //i starts with 0 as array index starts with 0 too

        //the task is to find and print out the maximum element
        for (int i = 0; i < xyz.length; i++) {
            System.out.println(xyz[i]);
        }





//   what is array

            String car = "BMW";
            String car1 = "Toyota";
            String car2 = "Honda";
            String car3 = "Hyundai";

/*      If you need to store multiple values with same
            variable type or String then we can use array
 *
             ArrayList - Set - Map
 */

//   how to declare it

//        String ,int ,boolean , double ,char ,short, float , byte , int , long

            String[] carArr = new String[3];

            carArr[0] = "BMW";

            carArr[1] = "Mercedes";

            carArr[2] = "Toyota";

            System.out.println("CarArr array is here ----->  "+carArr[2]);

            String carArr2[] = new String[3];

//second way to declare the array
            int[] num = {5,1,2,3,4,10};

            System.out.println(num[2]);

            String[] State = new String[4];

            State[0]= "Florida";
            State[1]= "Georgia";
            State[2]= "Kentucky";
            State[3]= "New York";

            System.out.println("State array 2 "+State[2]);

            State[2] = "New Jersey";

            System.out.println("State array 2 "+State[2]);

            boolean[] b1 = new boolean[4];

            b1[0] = true;

            b1[1] = false;

            b1[2] = true;



//   how to print it

//        first way is  --->   System.out.println(arrayName[which position]);

            int[] num2 = {1 , 10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 ,90 , 100 , 110 , 120 };

            System.out.println("num2 length ----> "+num2.length);

            for(int i = 0 ; i < num2.length ; i++ ){

                System.out.println("num2 array in for loop --->  "+num2[i]);

            }

//        in the array if there is a 20 print the --> 20 is in the array



        }
    }
