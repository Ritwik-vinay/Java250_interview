package Arrays2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class frequencyArray2 {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5,2,3,4,5,3,4,5,4,5,5};
        Map<Integer,Integer> frequency = new HashMap<>();
        for (int number: arr1){
            frequency.put(number,frequency.getOrDefault(number,0)+1);
        }
        for (Map.Entry<Integer,Integer> entryset: frequency.entrySet()){
            System.out.println("Element: "+ entryset.getKey() + " Frequency: "+entryset.getValue()+ " times.");
        }
    }
}
