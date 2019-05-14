package datastructure;

import java.util.HashSet;

public class HashSetDemo {

    /**
     * @author Jahidul Islam
     * Create HashSet and store data
     * Get the data from HashSet and print
     * Get the data from HashSet and insert it in db table
     *
     * */
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add("karim");
        hashSet.add("Rahim");
        hashSet.add("John");
        hashSet.add("Jamil");
        hashSet.add("sami");

        hashSet.forEach(str -> System.out.println(str));
    }

}
