package JavaWeek2;

public class BankSalary_encap {
    public static void main(String[] args) {

        employee1 Emp1 = new employee1();
        Emp1.E1Details();
        employee2 Emp2 = new employee2();
        Emp2.E2Details();


    }
}

class employee2 extends bank {
    void E2Details() {

        setSalary(2500000);
        setPosition("Manager");
        System.out.println("Salary : "+ getSalary() +" Position : "+ getPosition());
    }
}

class employee1 extends bank {
    void E1Details() {

        setSalary(300000);
        setPosition("Clerk");
        System.out.println("Salary : "+ getSalary() +" Position : "+ getPosition());

    }
}

class bank {
    private String position;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
