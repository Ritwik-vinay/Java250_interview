package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class topic1_mergeArray {
    public static void main(String[] args) {
        int[] i = {1,2,3,5,6,7};
        int[] j= {0,9,8,7,6,5};
        HashSet s = new HashSet();
        for (int number: i){
           s.add(number);
        }
        for (int number:j){
            s.add(number);
        }
        System.out.println(s);
    }
}
