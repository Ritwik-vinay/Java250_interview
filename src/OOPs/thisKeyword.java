package OOPs;

public class thisKeyword {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.dog_info("pug","Black");
        System.out.println(dog.breed);
        System.out.println(dog.color);


    }
    static class Dog{
        String breed;
        String color;
        void dog_info(String br , String clr){
            this.breed= br;
            this.color = clr;
        }
    }
}
