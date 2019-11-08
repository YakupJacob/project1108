package tekraret;

public class cls10 {
    public static void main(String[] arg) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=0; j--) {
            //for (int j = 0; j <=5; j++) {
                if (j>=i) {
                    System.out.print("$");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

