package Arrays2;

import java.util.HashMap;
import java.util.Map;

public class frequencyArray {
    public static void main(String[] args) {
        //Find the Frequency of Each Element in an Array
        int[] numbers= {2,3,5,4,2,3,5,6,8,10,2,2,2,3};
        Map<Integer ,Integer> frequencyMap= new HashMap<>();
        for (int number: numbers){
            frequencyMap.put(number,frequencyMap.getOrDefault(number,0)+1);
        }
        for (Map.Entry<Integer,Integer>entry: frequencyMap.entrySet()){
            System.out.println("Element: "+ entry.getKey()+ " Frequency: "+ entry.getValue());
        }
    }
}
