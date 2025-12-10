public class inheritanceExample {
    static void main() {
        dog d = new dog();
        d.makeSound();
        cat c = new cat();
        c.makeSound();
    }
}
class cat extends  Animal{
    void makeSound() {
        super.makeSound("Meow");
    }
}
class dog extends Animal{
    void makeSound(){
        makeSound("bark");
    }
}

class Animal{
    void makeSound (String sound){
        System.out.println("I make sound as " + sound);
    }
}
