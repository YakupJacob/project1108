package fib02;
import java.util.ArrayList;
import java.util.Collection;

public class clas4 {


    // 11. Write a Java program to reverse elements in a array list.
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red"); // 0
        list1.add("White");// 1
        list1.add("Black"); // 2
        list1.add("Green");
        System.out.println("List 1: " + list1);

        // code here

        // end code
        System.out.println("List 1 reverse : " + list1);
        // Collection.reverse(list1;
        System.out.println("new list: " + list1);


        int[] array = new int[5];
        int length = array.length;
        int firstValue = array[0];
        array[0] = 100;

        ArrayList<Integer> arrayList = new ArrayList();
        int arrayListLength = arrayList.size(); // to get size
        arrayList.add(10);// too add value
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("Before set");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
        int firstValueList = arrayList.get(0);
        arrayList.set(0, 100);
        System.out.println("\nAfter set");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }

        boolean contains40 = arrayList.contains(40);
        if (contains40) {
            System.out.println("\nIt has 40");
        } else {
            System.out.println("\nIt doest have 40");
        }

        arrayList.add(0, 2000);
        System.out.println("\nAfter adding to the beginning");
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");

            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red"); // 0
            colors.add("White");// 1
            colors.add("Black"); // 2
            colors.add("Green"); // 3
            System.out.println(colors);

            System.out.println("1. way");
            colors.remove(2);
            System.out.println(colors);

            System.out.println("2. way");
            colors.remove("Black");
            colors.remove("Red");
            colors.remove("Green");

            System.out.println(colors);


//
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("Red"); // 0
//        list1.add("White");// 1
//        list1.add("Black"); // 2
//        list1.add("Green");
//        System.out.println("List 1: " + list1);
//
//        // code here
//
//        // end code
//        System.out.println("List 1 reverse : " + list1);

        }
    }
}
//
//        import java.util.ArrayList;
//        import java.util.Collections;
//
//public class ArrayListTask11 {
//    // 11. Write a Java program to reverse elements in a array list.
//    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.add("Red"); // 0
//        list1.add("White");// 1
//        list1.add("Black"); // 2
//        list1.add("Green");
//        System.out.println("List 1: " + list1);
//        // code here
//        // Hint: you can .add() while going reverse,
//        // use extra arrayList to do it
//        // System.out.println("1. way");
//        // Collections.reverse(list1);
//
//        System.out.println("2. way");
//        ArrayList<String> list2 = new ArrayList<>();
//        for (int i = list1.size() - 1; i >= 0; i--) {
//            String element = list1.get(i);
////            System.out.println(element);
//            list2.add(element);
//        }
//        list1 = list2;
//        // end code
//        System.out.println("List 1 reverse : " + list1);
//        // result => List 1 reverse : [Green, Black, White, Red]
//    }
//}
