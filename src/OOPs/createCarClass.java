package OOPs;

public class createCarClass {
    public static void main(String[] args) {
        //Create a class Car with attribute model.
        CAR car = new CAR();
        car.Attribute1("HondaCity", 200000);
        //System.out.println(car.Attribute1("HondaCity", 200000));



    }
    public static class CAR{
        public void Attribute1(String Carname,int Carprice){
            String CName = Carname;
            int price = Carprice;
            String model = Carname+ " new Adv";
            System.out.println(Carname +" "+ price + "$ "+" "+ model);

        }
    }
}
