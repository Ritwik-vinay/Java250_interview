package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class List {
    static void main() {
        String [] a ={"Ritwik", "Bhanu", "Chetan", "Ashok"};
        ArrayList list = new ArrayList<String>();
        list.add("Ritwik");
        list.add("Abhishek");
        list.add("Bhavesh");
        list.add("Chetan");
        list.add("Ashok");

        for (Object b: list){
            System.out.print(b +" ");
            list.remove(2);
            System.out.print(b +" ");

        }
    }
}
