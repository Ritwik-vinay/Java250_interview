package Strings_topic;

public class topic1_string_immutable {
    public static void main(String[] args) {
        //Prove that String Objects are Immutable
        String str="Hello";
        str.concat("world") ;
        System.out.println(str);
    }
}
