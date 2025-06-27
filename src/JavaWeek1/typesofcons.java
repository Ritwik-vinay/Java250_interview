package JavaWeek1;

public class typesofcons {
    public static void main(String[] args) {
        typesofConsCreated tc = new typesofConsCreated();
        typesofConsCreated tc2= new typesofConsCreated(("Ritwik"));
        typesofConsCreated tc3= new typesofConsCreated(tc2);


    }
    public static class typesofConsCreated{
        String name;
        //1. Default Constructor
        typesofConsCreated(){
            System.out.println("I am the Default Supreme Power of the Class");
        }
        //2. Parameterized constructor
        typesofConsCreated(String name){
            this.name= name;
            System.out.println(name + " Supreme Power parameterized");
        }
        //3. Copy Constructor
        typesofConsCreated(typesofConsCreated obj2){
            this.name=obj2.name;
            System.out.println(name);
            System.out.println("Copy Constructor used Second Object");
        }
    }
}
