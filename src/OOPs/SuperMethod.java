package OOPs;

public class SuperMethod {
    public static void main(String[] args) {
        //Use super to call superclass method.
        Dog dog = new Dog();
        dog.show();


    }
    static class Dog extends Animal{
        void show(){
            super.show();
            System.out.println("I am a DOG");
        }
    }
    static class  Animal{
        void show(){
            System.out.println("I am an Animal");
        }
    }

}
