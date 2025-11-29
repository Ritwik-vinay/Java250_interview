import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class lsitExample {
    static void main() {
       List<String> fruits = new ArrayList<>();
       fruits.add("Mango");
       fruits.add("Apple");
       fruits.add("Orange");
       fruits.add("Banana");
       fruits.set(1, "Pomogranate");

for (int i=0; i<=fruits.size()-1;i++){
    System.out.println(fruits.get(i));
}
        System.out.println("**************");
        fruits.remove(1);
        Collections.shuffle(fruits);
        for (int i=0; i<=fruits.size()-1;i++){
            System.out.println(fruits.get(i));
        }


        System.out.println();

    }
}
