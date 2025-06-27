package JavaWeek1;

public class consCreations {
    public static void main(String[] args) {
        newConsCreation nc = new newConsCreation();
        nc.method1();

    }
    //Constructor is Created with same name can have parameters or cannot have parameters
    // No retun Type
    // is called as soon as the object is created
    //Used to Set initial Values  for object Attributes
    //Three types of constructor 1.default constructor 2. Parameterized Constructor 3. Copy Constructor

    public static class newConsCreation{
        void method1(){
            System.out.println(" As soon as the Oject or instance is created of an Class the constructor is called");
        }
        newConsCreation(){
            System.out.println(" I am a constructor Supreme Power");
        }
    }
}
