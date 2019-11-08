package tekraret;

public class cls12 {
    public static void main(String[] args) {
        String[][] array2D = {
                {"jacob", "aga", "janow"},
                {"class", "tech", "agajan"}
        };
        System.out.println("Item rows: " + array2D.length);
        System.out.println(array2D[0][0] + " " + array2D[1][2]);

        for (int i=0;i<array2D[0].length; i++) {
            System.out.println(array2D[0][i] + " " + array2D[1][i]);
        }
    }

}
