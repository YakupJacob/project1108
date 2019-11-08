package fib02;

import java.util.ArrayList;

public class clas2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        int arrayListLength = arrayList.size(); // to get size
        arrayList.add("\nblue");// too add value
        arrayList.add("\nRed");
        arrayList.add("\nBlack");
        arrayList.add("green");
        //for(String str:arrayList) {
        //for(int i=0;i<arrayList.size();i++)
        System.out.print(arrayList + " ---------------");
        //}

        arrayList.add(0, "yellow");
        System.out.println("\nAfter set" + arrayList);

        //arrayList.remove(index:2, "");
        System.out.println("remove" + arrayList.get(2));
        System.out.println("New arr" + arrayList);
    }
}


//        int[] array = new int[5];
//        int length = array.length;
//        int firstValue = array[0];
//        array[0] = 100;
//
//        ArrayList<Integer> arrayList = new ArrayList();
//        int arrayListLength = arrayList.size(); // to get size
//        arrayList.add(10);// too add value
//        arrayList.add(20);
//        arrayList.add(30);
//
//        System.out.println("Before set");
//        for (Integer integer : arrayList) {
//            System.out.print(integer + " ");
//        }
//        int firstValueList = arrayList.get(0);
//        arrayList.set(0, 100);
//        System.out.println("\nAfter set");
//        for (Integer integer : arrayList) {
//            System.out.print(integer + " ");
//        }
//
//        boolean contains40 = arrayList.contains(40);
//        if(contains40){
//            System.out.println("\nIt has 40");
//        }else {
//            System.out.println("\nIt doest have 40");
//        }
//
//        arrayList.add(0, 2000);
//        System.out.println("\nAfter adding to the beginning");
//        for (Integer integer : arrayList) {
//            System.out.print(integer + " ");
//        }



//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
//
//
//2. Write a Java program to iterate through all elements in a array list.
//
//
//3. Write a Java program to insert an element into the array list at the first position.
//
//
//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//
//
//5. Write a Java program to update specific array element by given element.
//
//
//6. Write a Java program to remove the third element from a array list.
//
//
//7. Write a Java program to search an element in a array list.
//
//
//8. Write a Java program to sort a given array list.
//
//
//9. Write a Java program to copy one array list into another.
//
//
//10. Write a Java program to shuffle elements in a array list.
//
//
//11. Write a Java program to reverse elements in a array list.
//
//
//12. Write a Java program to extract a portion of a array list.
//
//
//13. Write a Java program to compare two array lists.
//
//
//14. Write a Java program of swap two elements in an array list.
//
//
//15. Write a Java program to join two array lists.
//
//
//16. Write a Java program to clone an array list to another array list.
//
//
//17. Write a Java program to empty an array list.
//
//
//18. Write a Java program to test an array list is empty or not.
//
//
//19. Write a Java program to trim the capacity of an array list the current list size.
//
//
//20. Write a Java program to increase the size of an array list.
//
//
//21. Write a Java program to replace the second element of a ArrayList with the specified element.
//
//
//22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
