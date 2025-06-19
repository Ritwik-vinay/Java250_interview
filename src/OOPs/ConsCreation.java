package OOPs;

public class ConsCreation {
    public static void main(String[] args) {
        //Use constructor to initialize a variable.
        Student std= new Student();


    }
    //By default, calls the constructor
    public static class Student{
        Student(){
            int UniverseNumber= 1;
            String studentName= "Lucky Ritwik";
            System.out.println(UniverseNumber + " "+ studentName);

        }
    }
}
