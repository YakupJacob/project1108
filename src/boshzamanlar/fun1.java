package boshzamanlar;

public class fun1 {
    public static void main(String[] arg){
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++){
                System.out.println(i +" "+j);
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i;j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        int i=1;
        while (i<=10){
            System.out.println(i);
            i++;
        }
        for(int e=1;e<=10;e++){
            if (e==5){
                break;
            }
            System.out.println(i);
        }
    }
}
