package OOPs;

public class Inheritance_Opps {
    public static void main(String[] args) {
        Animal animal= new Animal();
        dog d= new dog();
        d.sound();
        animal.sound();
    }
    static class dog extends Animal{
        public static void sound(){
            System.out.println("Barks");

        }
    }
    static class Animal{
        public static void sound(){
            System.out.println("Generic Sound");

        }
    }
}
