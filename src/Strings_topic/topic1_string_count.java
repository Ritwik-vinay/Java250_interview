package Strings_topic;

public class topic1_string_count {
    public static void main(String[] args) {
        //Count the Number of Words in a String
        String str_count="My name is lakhan";
        int each_count=str_count.length();
        System.out.println("Count of each alphabet "+ each_count);
        String[] word= str_count.split("\\s+");
        int count = word.length;
        System.out.println("Total Count of words "+ count);
    }
}
