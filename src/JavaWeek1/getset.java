package JavaWeek1;

public class getset {

    public static class Student {
        static String name;
        static int rollNo;
        static String sub;

        static void Set(String n, int r, String s){
            name = n;
            rollNo=r;
            sub= s;
        }
        static void get(){
            System.out.println(name+" , "+rollNo+" , "+ sub );
        }

        public static void main(String[] args) {
            Student s1= new Student();


           Student.Set("Rahul",1,"PCB");
           Student.Set("Mohan",2,"PCM");
           Student.get();
        }
    }

}