package api;

public class StringAPI {

    /**
     * @author Jahiudl Islam
     * Read String JDK 8 API documantation to be read and String source code to be viewed
     * Demonastrate your understanding on String after reading the documentation
     * You are free to document your understanding using comment
     * Reason to comment is to keep documentation so that next developer can get highlevel understaning of your implementation
     * by reading your comments/documents
     *
     * */
    public static void main(String[] args) {
        String firstName = "Mozammel";
        String lastName = "Sarkar";
        //Getting string in uppercase
        System.out.println(firstName.toUpperCase());
        //Concating middle initial with first name
        System.out.println(firstName.concat(" H"));
        //Checking the length of the string
        System.out.println(firstName.length());
        //Getting index of a character
        System.out.println(firstName.indexOf('z'));
        //Getting string in lowercase
        System.out.println(firstName.toLowerCase());
        //Replacing a character with new one
        System.out.println(firstName.replace('z', 'j'));
        //Creating substring from a string
        System.out.println(firstName.substring(2,5));
        //Checking end character with boolean
        System.out.println(firstName.endsWith("a"));
        System.out.println(lastName.toCharArray());
        //Checking string for a character availability
        System.out.println(lastName.contains("m"));
    }
}
