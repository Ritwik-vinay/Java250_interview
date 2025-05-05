package Arrays;

import java.util.HashSet;
import java.util.Set;

public class remove_Duplicate {
    public static void main(String[] args) {
        int[] list= {1,2,4,3,3,5,6,7,8};
        Set lists = new HashSet();
        for (int a: list){
            lists.add(a);

        }
        System.out.println(lists);

    }


}
