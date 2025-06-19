package OOPs;

public class methodCreation {
    public static void main(String[] args) {
         car c = new car();
         c.method();


    }
    public static class  car{

        void method(){
            String model= "Mercedes CLS";
            int make =2025;

            model= model.toUpperCase();
            System.out.println(model + " "+ make);
        }
    }

}
