package String2_topic;

public class countVowelandCons {
    public static int[] countvowsandCons(String str){
        int vCount=0;
        int cCount=0;
        for (int i=0;i<str.length();i++){
            Character ch= str.charAt(i);
            if (ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vCount++;
            } else if (ch>='a'&& ch<='z') {
                cCount++;

            }
        }
        return new int[]{vCount,cCount};
    }

    public static void main(String[] args) {
        String  str="abhinavbhoshle";
        int[] result= countvowsandCons(str);
        for (int r: result){
            System.out.println(r);
        }
    }
}
