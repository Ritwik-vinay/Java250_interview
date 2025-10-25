package StudyMaterial;

public class StudyMaterial_incremental {
    public static void main(String[] args) {

        //Increamental and Decremental Operator
        //1. ++ 2. --
        //PreIncremental or PreDecremental ++5, --5 1-5 or 1+5
        // PostIncremental or Post Decremental
        //Pre -> First increment/decrement then use

        int age = 20;
        int age2= age;
        System.out.println(age);// 20
        System.out.println(--age2); //19

        int a = 5;
        int b=++a;
        System.out.println(a);
        System.out.println(b);

        //Post-> first use then Increment or decrement

        int b1= 5;
        b1= b1++;
        System.out.println(b1);

//        int a=12;
//        System.out.println("*****************");
//        for (int i=1; i<=10;i++){
//
//            System.out.println(a*i );
//        }



    }
}
