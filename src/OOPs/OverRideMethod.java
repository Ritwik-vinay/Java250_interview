package OOPs;

public class OverRideMethod {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat cat = new Cat();
        Animal a2 = new Cat();
        Animal a3 = new Dog();
        System.out.println(a.sound());
        System.out.println(cat.sound());
        System.out.println(a2.sound());
        System.out.println(a3.sound());
        //The method in the child class must have the same name,
        // return type, and parameters as the one in the parent class.

    }
    //Method overriding occurs when a subclass provides a specific
    // implementation of a method that is already defined in its superclass.

     static class Cat extends Animal{
         @Override
        public String sound(){
            return "Meow";
        }

    }
    static class Dog extends Animal{
        @Override
        public String sound(){
            return "Bark";
        }
    }
     static class Animal{
        public String sound(){
            return "Generic Sound";
        }
    }
}
