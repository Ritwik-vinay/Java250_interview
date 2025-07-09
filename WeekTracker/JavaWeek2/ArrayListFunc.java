package JavaWeek2;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFunc {
    public static void main(String[] args) {
        ArrayList<String> emplist = new ArrayList<>();
        emplist.add("Raj");
        emplist.add("Amit");
        emplist.add("Sneha");

        for (int i=0;i<=emplist.size()-1;i++){
            System.out.println(emplist.get(i));
        }
        System.out.println("------------");
        Iterator<String> iterator= emplist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------");
        emplist.forEach(name-> System.out.println("lamda "+ name));

    }
}
