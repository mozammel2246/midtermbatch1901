package problems;

import api.StringAPI;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */


public class Anagram {

    public static void isAnagram(String a, String b){
    boolean status;
        if (a.length() != b.length()){
        status = false;
    }
        else {
        char[] firstString = a.toLowerCase().toCharArray();
        char[] secondString = b.toLowerCase().toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);
        status = Arrays.equals(firstString, secondString);
    }
        System.out.println(a + " is anagram of " +b + " : " + status);
}
    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        isAnagram("keep", "peek");
        isAnagram("many", "very");

    }
}
