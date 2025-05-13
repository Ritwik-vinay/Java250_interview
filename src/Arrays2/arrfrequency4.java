package Arrays2;

import java.util.HashMap;
import java.util.Map;

public class arrfrequency4 {
    public static void main(String[] args) {
        int[]arr1={3,4,5,2,3,4,5,6,6,7,4,5,3,4,4,32};
        Map<Integer,Integer> fmap= new HashMap<>();
        for (int number: arr1){
            fmap.put(number,fmap.getOrDefault(number,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry: fmap.entrySet()){
            System.out.println("Elm "+ entry.getKey()+" freq "+ entry.getValue());
        }
    }
}
