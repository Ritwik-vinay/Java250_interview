package Day1_revision;

import java.util.*;

public class usingComparator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Raj", "Zayad", "Aman", "Mohan", "Vinay"));

        //Using Comparator(anonymous inner class)
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Comparator "+ names);
    }
}
