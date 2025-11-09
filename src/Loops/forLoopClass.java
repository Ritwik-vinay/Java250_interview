package Loops;

public class forLoopClass {
    public static void main(String[] args) {
        // Print 100 Times Hello World
//        for (int Counter =1; Counter<100; Counter = Counter+1){
//            System.out.println("Hello World");
//        }

        for (int i= 1; i<= 10; i++){
            System.out.print(i +" ");
        }
        System.out.println();

        //While

        int i =1;
        while (i<=10){
            System.out.print(i +" ");
            i++;
        }
        System.out.println();
        System.out.println(" ***************************");
        int j =1;

        do{
            System.out.print(j +" ");
            j++;
        }while (j<=10);



    }
}
