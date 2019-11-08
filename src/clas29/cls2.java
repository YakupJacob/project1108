package clas29;

public class cls2 {
    public static void main(String[] args) {

        String[][] strarr2 = {{"USA" , "Mexico"} , {"South Korea" ,"Russia" , "China"} , {"India","Pakistan"}};

        for(int row = strarr2.length-1 ; row>=0 ; row--){

            for(int col = strarr2[row].length-1 ;col>=0; col--){

                char[] strarr3Chars = strarr2[row][col].toCharArray();

                for(int k = strarr3Chars.length-1 ; k>=0 ; k-- ){

                    System.out.print(strarr3Chars[k] );

                }

                System.out.print(" ");

            }



        }
    }
}
