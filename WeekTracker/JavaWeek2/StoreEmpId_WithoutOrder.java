package JavaWeek2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class StoreEmpId_WithoutOrder {
    public static void main(String[] args) {
        HashSet<String> empId = new HashSet<>();
        empId.add("Rahul");
        empId.add("Ashwin");
        empId.add("Bhavesh");
        empId.add("Chandu");
        empId.add("Bhavesh");
        System.out.println(empId);

        LinkedHashSet<String> empID2 = new LinkedHashSet<>();
        empID2.add("Rahul");
        empID2.add("Ashwin");
        empID2.add("Bhavesh");
        empID2.add("Chandu");
        empID2.add("Bhavesh");
        System.out.println(empID2);

        TreeSet<String> emp3= new TreeSet<>();
        emp3.add("Rahul");
        emp3.add("Ashwin");
        emp3.add("Bhavesh");
        emp3.add("Chandu");
        emp3.add("Bhavesh");
        System.out.println(emp3);

    }
}
