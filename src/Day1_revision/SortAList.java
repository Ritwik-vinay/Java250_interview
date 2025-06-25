package Day1_revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortAList {
    public static void main(String[] args) {
        //Write a program to sort a List<String> using both Comparator and Lambda.
        //Direct sorting of the List strings

        List<String> mylist = Arrays.asList("Rahul","Raman","Aman","Baman","Chandan","Vinay");
        mylist.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
