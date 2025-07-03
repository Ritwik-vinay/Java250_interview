package JavaWeek1;

public class enCap_Vehicle {
    public static void main(String[] args) {
        Bajaj bajaj = new Bajaj();
        bajaj.brand("Pulsar");
        bajaj.makeModel("NS_2025");
        bajaj.VehicleAge(5);
    }

}
class Bajaj implements Vehicle{
    public void brand(String BrandName){
        System.out.println("Brand Name is: "+ BrandName);
    }
    public void makeModel(String Make_c){
        System.out.println("Make and Model of the Vehicle: " + Make_c);
    }
    public void VehicleAge(int Years_c){
        System.out.println("Age of vehicle: " + Years_c);

    }

}
interface Vehicle{
    public void brand(String BrandNae_c);
    public void makeModel(String Make_c);
    abstract void VehicleAge(int Years_c);
}



