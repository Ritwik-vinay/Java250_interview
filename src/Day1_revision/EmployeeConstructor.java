package Day1_revision;

public class EmployeeConstructor {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.Employee("Ritwik", 12,3500000, "Software Egineer");

    }
}
//Constructor Overloading
class Employee{
    void Employee(String Ename, int EId){
        System.out.println(Ename + " "+ EId);
    }
    void Employee(String Ename, int EId, int salary){
        System.out.println(Ename +" "+ EId +" "+ salary);

    }
    void Employee(String Ename, int EId, int salary, String Position){
        System.out.println(Ename +" "+ EId +" "+ salary + " "+ Position);
    }
}


