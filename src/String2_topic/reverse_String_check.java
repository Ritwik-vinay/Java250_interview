package String2_topic;

public class reverse_String_check {
    public static void main(String[] args) {
        String se = "This is my window";
        StringBuilder sb = new StringBuilder();


        for (int i = se.length()-1; i >= 0; i--) {
            sb.append(se.charAt(i));

        }
        System.out.println(sb.toString());


    }
}

