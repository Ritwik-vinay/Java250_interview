package JavaWeek1;

public class encap2 {
    public static void main(String[] args) {
        methodAccMod methMod = new methodAccMod();
        methMod.meth1();
        methMod.meth1("Ritwik");
        methMod.meth1("Ritwik", 29);
        methMod.setAge(29);
        methMod.setName("Ritwik");
        methMod.setSalary(50000000.00d);
        methMod.meth();


    }
}
class methodAccMod{
    private String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void meth1(){
        System.out.println("I am Public in Nature");
    }
    void meth1(String Name){
        System.out.println(Name + " I am default in Nature");
    }
    protected void meth1(String Name , int age){
        System.out.println(Name +" I am Protected in nature. My Age is "+ age);
    }
    void meth(){
        System.out.println(name  + " I am Private in nature. My Age is: "+age +" My Salary is "+ salary);

    }
}
