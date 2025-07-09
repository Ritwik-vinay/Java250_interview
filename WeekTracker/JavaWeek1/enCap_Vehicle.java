package JavaWeek1;

interface Vehicle {
    void brand(String brandName);
    void makeModel(String makeModel);
    void vehicleAge(int years);
}

class Bike implements Vehicle {
    public void brand(String brandName) {
        System.out.println("Bike Brand: " + brandName);
    }

    public void makeModel(String makeModel) {
        System.out.println("Bike Model: " + makeModel);
    }

    public void vehicleAge(int years) {
        System.out.println("Bike Age: " + years + " years");
    }
}

class Car implements Vehicle {
    public void brand(String brandName) {
        System.out.println("Car Brand: " + brandName);
    }

    public void makeModel(String makeModel) {
        System.out.println("Car Model: " + makeModel);
    }

    public void vehicleAge(int years) {
        System.out.println("Car Age: " + years + " years");
    }
}

public class enCap_Vehicle {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.brand("Pulsar");
        bike.makeModel("NS_2025");
        bike.vehicleAge(5);

        System.out.println("----------");

        Vehicle car = new Car();
        car.brand("Toyota");
        car.makeModel("Fortuner");
        car.vehicleAge(3);
    }
}
