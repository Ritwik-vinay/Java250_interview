package String2_topic;

public class Get_the_repetative_word {
    public static void main(String[] args) {
        String str= "abcdcefd";
        String printed="";
        for (int i=0;i<= str.length()-1;i++){
           char ch = str.charAt(i);
            if (str.indexOf(ch)!= str.lastIndexOf(ch)&& !printed.contains(String.valueOf(ch))){
                System.out.println(ch);
                printed+=ch;
            }

        }
    }
}
