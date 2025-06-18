package Arrays_and_ArrayList;

import java.util.ArrayList;

public class ArrayListRemoveArray {
    public static void main(String[] args) {
        //Remove an element from ArrayList.
        ArrayList<String> listofFruits = new ArrayList<>();
        listofFruits.add("Guava");
        listofFruits.add("Apple");
        listofFruits.add("mango");
        listofFruits.add("Grapes");
//        for (int i=0;i<listofFruits.size();i++){
//            System.out.println("Before removing "+ " : "+  listofFruits);
//
//        }
        System.out.println("Before removing "+ " : "+  listofFruits);

        listofFruits.remove(listofFruits.get(2));
        System.out.println("After removing "+ " : "+ listofFruits);






    }
}
