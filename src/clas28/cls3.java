package clas28;

public class cls3 {
    public static void main(String[] arg){
        int [] num = {5,6,7,8,9};
        int counter = 0;
        for (int i=0; i<num.length; i++){
            if(num[i] %2 == 0){
                System.out.println("its even");
               counter++;
            }

        }
        System.out.println(counter + "you have");
    }
}
