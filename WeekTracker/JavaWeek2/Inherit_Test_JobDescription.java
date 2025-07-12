package JavaWeek2;

public class Inherit_Test_JobDescription {
    public static void main(String[] args) {
        Employee employee= new Tester();
        employee.Details("Ritwik","Tester");
        employee.Details("Prakash","Developer");

    }
}
class Tester extends Employee{
    void Details(String Name , String Desname){
        this.EName = Name;
        this.EDesignation= Desname;
        System.out.println("My Name is " + Name + " and Designation is "+ Desname);    }
}
class Developer extends Employee{
    void Details(String Name, String Desname){
        this.EName= Name;
        this.EDesignation= Desname;
        System.out.println("My Name is " + Name + " and Designation is "+ Desname);
    }
}
class Employee{
    String EName;
    String EDesignation;
    void Details(String Name, String Desname){

        System.out.println("My Name is " + Name + " and Designation is "+ Desname);
    }

}
