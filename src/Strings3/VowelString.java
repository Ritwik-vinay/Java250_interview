package Strings3;

public class VowelString {
    public static void main(String[] args) {
        //Count vowels in a string.
        String str= "Vowel";
        str= str.toLowerCase();
        int vCount= 0;
        int cCount =0;
        for (int i=0; i<= str.length()-1;i++){
            char ch= str.charAt(i);
            if (ch=='a'|| ch== 'e'|| ch== 'i'|| ch=='o'|| ch=='u'){
                System.out.println(str.charAt(i) +  " Vowel");
                vCount++;
            }
            else {
                System.out.println(str.charAt(i) + " Consonent");
                cCount++;
            }
        }
        System.out.println(vCount +  " is the count of Vowel");
        System.out.println(cCount +  " is the count of Consonent");

    }
}
