package OOPs;

public class ClassCreation {
    public static void main(String[] args) {
        Car car = new Car();
        car.model= "Honda City 2025";
        System.out.println(car.model);

    }
    static class  Car{
        String model;
    }
}
