package JavaWeek1;

public class AnimalSound {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        animal.sound();
        cat.sound();
        dog.sound();

    }
    static class Cat extends Animal{
        @Override
        void sound(){
            System.out.println("I can Meow");
        }
    }
    public static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("I can Bark");
        }
    }
    public static class Animal{
        void sound(){
            System.out.println("I am Talk in any Language");
        }
    }


}
