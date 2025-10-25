public class intvaluecheck {
    public static void main(String[] args) {
        //Unary Operator

        int num =5;
        //num= num{5}+5
        // num=num+1;
        System.out.println(++num);

        //Binary Operator
        int numb=15;
        System.out.println(num>numb);
        System.out.println(numb>num);
        //Ternary Operator
        //greater number num , numb, number
        int number =11;

        int result=(num>numb)? (num>number ? num : numb ) :  (numb>number ? numb:number);
        System.out.println(result);

        if(num>numb && num>number){
            System.out.println(num);
        } else if (numb>num && numb>number) {
            System.out.println(numb);
        }
        else {
            System.out.println(number);
        }

        int result2= (num>numb)? num: numb;
        System.out.println("*****************");
        System.out.println(result2);

        //Assignment Operator(=)
        int a = 23;
        String b="Ritwik";



    }

}
//class main2{
//    //Oops -> Inheritance , Polymorphism
//}

