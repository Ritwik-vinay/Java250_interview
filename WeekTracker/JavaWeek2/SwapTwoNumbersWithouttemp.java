package JavaWeek2;

public class SwapTwoNumbersWithouttemp {
    public static void main(String[] args) {
        //Swap two Numbers with temp variable
        //Enter two number use  a temp to Store the value
        int num1 = 20;
        int num2= 10;

        num1 = num1+num2;
        num2 = num1-num2;
        num1= num1-num2;
        System.out.println(num1 +"  && " + num2);


    }
}
