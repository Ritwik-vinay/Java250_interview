package Day1_revision;

import java.util.Arrays;
import java.util.List;

public class WithStreams {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ritwik", "Abhishek","Banku","Chandan","Dinesh","Jignesh");
        // Sort in reverse order (A to Z)
        names.sort((s1, s2)-> s1.compareTo(s2));
        System.out.println("Sorted by names "+ names);

        // Sort in reverse order (Z to A)
        names.sort((s1,s2)->s2.compareTo(s1));
        System.out.println("Reverse the name by Z to A "+ names);

        //Sort by length
        names.sort((s1,s2)->Integer.compare(s1.length(),s2.length()));
        System.out.println("Sorted by Length "+ names);

    }
}
