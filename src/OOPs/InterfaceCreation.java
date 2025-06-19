package OOPs;

public class InterfaceCreation {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        a.sound();
        b.sound();

    }
    //An interface in Java is a contract: it defines what a class can do, but not how.
    //It can have:
    //Abstract methods (implicitly public and abstract)
    //Default methods (from Java 8)
    //Static methods
    //Constants (public static final)
    static class Cat implements Animal{
        public void sound(){
            System.out.println("Cat Meow");
        }
    }
    static class Dog implements Animal {
        public void sound(){
            System.out.println("Dog Barks");
        }
    }
   interface Animal{
        void sound();

   }
}
