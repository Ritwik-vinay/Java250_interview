package Chapter_3_;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1= new Dog();
        dog1.bark();
        dog1.name="bart";
        Dog[] mydogs = new Dog[3];
        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = dog1;
        mydogs[0].name="fred";
        mydogs[1].name= "Marge";
        System.out.print("last dog's name is ");
        System.out.println(mydogs[2].name);

        int x= 0;
        while (x<mydogs.length){
            mydogs[x].bark();
            x=x+1;
        }
    }
    public  void bark(){
        System.out.println(name +" says Ruff!");
    }
    public void eat(){}
    public void chasecat(){}
}
