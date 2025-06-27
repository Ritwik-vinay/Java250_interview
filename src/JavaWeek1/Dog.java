package JavaWeek1;

public class Dog {
    String name;
    int age;
    String breed;
    String color;

    public Dog(String n, int a, String b, String c){
        this.name=n;
        this.age=a;
        this.breed=b;
        this.color=c;

    }
    public String getName(){
        return name;
    }
    public  int getAge(){
        return  age;
    }
    public String getBreed(){
        return breed;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        return ("Name : "+this.name + " Breed, age , color is:  "+ breed +", "+ age +", "+color+" , ");
    }
    public static void main(String[] args){
        Dog tuffy = new Dog("Tuffy",5,"Labrador","white");
        System.out.println(tuffy.toString());
    }

}
