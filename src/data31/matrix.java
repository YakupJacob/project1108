package data31;

public class matrix {

//    What is the output of this question
     public static void main(String[] args) {
        int arr[] = {11, 22, 33};
        System.out.print(arr[2]);
        }
//    Option
//    A) 11 33
//    B) Error
//    C) exception
//    D) 11 -33

public static void main3(String[] args) {
        int arr[][] = {
        {11, 22},
        {33, 44, 55}
        };
        for (int i = 0; i < 2; i++) {
        for (int j = 0; j < arr[i].length; j++)
        System.out.print(arr[i][j] + " ");
        System.out.println();
        }
        }
//    Option
//    A) 11 22
//            33 44 55
//    B) 11 22
//            33 44
//    C) Exception
//    D) Error
    public static void main6(String[] args) {
    int arr[] = new int[5];
    int arr2[] = new int['a'];
    byte bt = 10;
    int arr3[] = new int[bt];
    System.out.println(arr.length);
    System.out.println(arr2.length);
    System.out.println(arr3.length);
}

    //What is the output of this question?
    public static void main8(String[] args) {
        int arr[][] = {
                {11, 22},
                {33, 44, 55}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
//    Option
//    A) 11 22
//            33 44 55
//    B) 11 22
//            33 44
//    C) Exception
//    D) Error


//What is the output of this question?
    public static void main7(String[] args) {
        int arr[] = new int[5];
        int arr2[] = new int[5];
        System.out.print(arr.length + " ");
        System.out.print(arr2.length);
    }
  //  Option
//    A) 5 5
//    B) Error
//    C) Exception
//    D) None
    }


