package officehours;

import java.util.ArrayList;
import java.util.Arrays;

public class clas10 {
    public static void main(String[] arg){
//        String str = "https://www.etsy.com/listing/674066061/ring-security-teddy-bear-and-gift-bag-8?ga_order=most_relevant&ga_search_type=all&ga_view_type=gallery&ga_search_query=teddy+bear&ref=sc_gallery-1-2&plkey=4c19dd30850b84785c5ce85d6741aa27ccebb5ed%3A67";
//    String[] strArr= str.split("5");
//    for(int i=0; i<strArr.length;i++){
//        System.out.println(strArr[i]);
//    }

        int numbers[] = {-10, 24,50,-88,106};
        int max = numbers[0];
        int min = numbers[0];
        for (int i=1;i<numbers.length; i++){
            if (max>numbers[i]){
                max=numbers[i];
            }
            else if (min < numbers[i]){
                min=numbers[i];


            }

        }
        System.out.println(numbers.length +"========"+ Arrays.toString(numbers));
        System.out.println("my min no;   "+ min + " my max no  "+ max);
    }

}
