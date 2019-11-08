package data31;

public class mat1 {
    public static void main(String[] arg){
        int a =7;
        int b=9;
        int c;
        for (int i = 0; i<20; i++){
            c= a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
