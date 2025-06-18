package Arrays_and_ArrayList;

import java.util.ArrayList;

public class AddElement {
    public static void main(String[] args) {
        //Add elements to an ArrayList and print.
        int[] arr = {1, 2, 3, 4};
        ArrayList<Integer> list = new ArrayList<>();
        int addElement= 5;
        for (int i : arr) {
            list.add(i);

        }
        list.add(addElement);
        System.out.println(list);


    }
}
