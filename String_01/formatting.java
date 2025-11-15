public class formatting {
    // Marks -> english67 math 56 chem 88
    // How the output is displayed ->
    // 100/3 = 33.333333333333333333333333333333333333333333333333333333333333333333333
    public static void main(String[] args) {
        // Printf and // String.format
        // %s-> String %d-> integer %f -> Floater values %.2f-> after decimal we consider only 2 values
        // %n -> New line %c -> character
        // Syntax -> system.out.println("Format String ", values)
        System.out.printf("Name: %s %n Age: %d  %n Grade: %c", "John", 89, 'A');
        float num= 89.8467865765675765f;
        System.out.println();
        System.out.printf("Num %.2f" ,num);
        String str = "15";

        System.out.println( String.format("%nNumber : %s" , str));


    }
}
