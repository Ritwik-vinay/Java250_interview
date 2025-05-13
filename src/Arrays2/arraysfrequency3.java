package Arrays2;

import java.util.HashMap;
import java.util.Map;

public class arraysfrequency3 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,2,2,3,3,3,4,4,4,5,6,};
        Map<Integer,Integer> map = new HashMap<>();
        for (int numb: arr1){
            map.put(numb,map.getOrDefault(numb,0)+1);
        }
        for (Map.Entry<Integer,Integer>entry: map.entrySet()){
            System.out.println("Element: "+ entry.getKey() +" Frequency "+entry.getValue());
        }
    }
}
