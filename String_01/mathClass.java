public class mathClass {
    public static void main(String[] args) {
        // Math -> Class which is already created by the java person
//        System.out.printf("SQRT of 8: %.2f",Math.sqrt(8));
//        System.out.println();
//        double a =Math.pow(2,3) ;
//        int b= (int) a;
//        System.out.println(b);
        int num1= 55;
        int number2= 67;


//        System.out.println(Math.abs(-5));
//        System.out.println(Math.max(90,56));
//        System.out.println(Math.min(56,58));

        // 0.0 to 1.0
        System.out.println(Math.random());
        int randomNum= num1+(int)(Math.random()*((num1 -number2)+1));
        System.out.println(randomNum);

        try {
            int a= 10/0;
            System.out.println(a);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
