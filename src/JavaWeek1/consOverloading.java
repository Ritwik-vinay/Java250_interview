package JavaWeek1;

public class consOverloading {
    public static void main(String[] args) {
        OverLoadCons ol = new OverLoadCons();
        OverLoadCons ol2=    new OverLoadCons( "Ritwik");
        OverLoadCons ol3= new OverLoadCons("Lucky RV",24);

    }
    //Constructor Overloading
    //Multi Parameter in Overloading
    public static class OverLoadCons{
        OverLoadCons(){
            System.out.println("Parameterized Cons 1");
        }
        OverLoadCons(String name){
            System.out.println("Parameterized Constructor "+ name);
        }
        OverLoadCons(String name, int age){
            System.out.println("Parameterized Constructor "+ name + " , "+ age);
        }

    }
}
