package clas28;

public class cls7 {
    public static void main(String[] arg) {
        String[][] array = {
                {"apple", "lemon", "peach"},
                {"red", "green", "blue"}
        };
       // System.out.println(array[1][0] + " " + array[0][0]);
        //System.out.println(array[1][1] + " " + array[0][1]);
        //System.out.println(array[1][2] + " " + array[0][2]);
//        for (int i =0;i <array.length; i++){
//            for(int j =0; j < array[i].length; j++){
//                System.out.print(array[i][j] +" ");
//            }
//            System.out.println();

        for (int i = array.length-1; i>=0; i--){
           for(int j=0; j<array[i].length; j++) {

               System.out.print(array[i][j] + " ");
           }
            System.out.println();
        }


    }
}
