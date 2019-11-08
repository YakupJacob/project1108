package tekraret;

public class cls13 {
    public static void main(String[] args) {
        int [][] examResult = {
                {10,20,45},
                {99,88,77}
        };
       // System.out.println(examResult[0][0] + " " + examResult[0][1] +" " + examResult[0][2]);
       //System.out.println(examResult[1][0] + " " + examResult[1][1] +" " + examResult[1][2]);
            for (int row=0; row < examResult.length; row++) {
                for (int col =0; col< examResult[row].length; col++){
                    System.out.println(examResult[row][col] +" ");
                }
                System.out.println();
            }
    }
}
