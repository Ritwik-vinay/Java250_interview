package String2_topic;

public class vowsconscheck3 {
    public static void main(String[] args) {
        String s ="RitwikVinay";
        int[] result= vowscons(s);
        System.out.println("Vowel count is "+result[0]);
        System.out.println("Cons count is "+result[1]);
    }
    public static int[] vowscons(String s){
        int vCount=0;
        int cCount =0;
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++){
            Character ch= s.charAt(i);
            if (ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){

                vCount++;

            } else if (ch>='a' && ch<='z') {
                cCount++;

            }
        }
        return new int[]{vCount,cCount};

    }
}
