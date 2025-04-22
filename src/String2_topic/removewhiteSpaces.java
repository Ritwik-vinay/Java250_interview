package String2_topic;

public class removewhiteSpaces {
    public static void main(String[] args) {
        //Remove White Spaces
        String str ="I am the Best";
        str= str.replaceAll("\\s","");
        System.out.println(str);
    }
}
