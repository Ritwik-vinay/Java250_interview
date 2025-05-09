package String2_topic;

public class removeDuplicateString {
    public static void main(String[] args) {
        String str= "Hello World";
        String res= removeDuplicate(str);
        System.out.println(res);


    }
    public static String removeDuplicate(String str){
        String result= "";
        for (int i=0;i<str.length();i++){
            Character ch = str.charAt(i);
            if (result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        return result;
    }
}
