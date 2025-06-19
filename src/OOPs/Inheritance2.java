package OOPs;

public class Inheritance2 {
    public static void main(String[] args) {
        animal ani = new animal();
        System.out.println(ani.sound());
        dog DOG = new dog();
        System.out.println(DOG.sound());

    }
    public static class dog extends animal{
        public String sound(){
            return "Barks";
        }
    }
    public static class animal{
        public String sound(){
            return "Generic Sound";
        }
    }
}
