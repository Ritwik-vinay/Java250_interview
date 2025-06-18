package Strings3;

public class StringContainsWord {
    public static void main(String[] args) {
        //Check if string contains a word.
        String str = "This is a word in the sentence";
        str= str.toLowerCase();
        if (str.contains("word")){
            System.out.println(str.replace("word" ,"____"));
        }
        else {
            System.out.println("No such Word");
        }
    }
}
