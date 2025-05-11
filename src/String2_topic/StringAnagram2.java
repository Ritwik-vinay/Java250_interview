package String2_topic;

import java.util.Arrays;

public class StringAnagram2 {
    public static void main(String[] args) {
        String a="triangle";
        String b= "integral";
        System.out.println(anagram(a,b)? "Anagram": "not Anagram");

    }
    public static Boolean anagram(String str1, String str2){
        str1= str1.replaceAll("\\s","").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();
        if (str1.length()!= str2.length()){
            return false;
        }
        char[] arr1= str1.toCharArray();
        char[] arr2= str1.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return  Arrays.equals(arr1, arr2);

    }



}
