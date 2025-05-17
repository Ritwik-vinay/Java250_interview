package LeetCode_Easy;

public class reverseInt {
    public static void main(String[] args) {
        int value= 987876;
        for(int i=value; i>=0;i--){
            value= i;
        }
        System.out.println(value);


    }
}
