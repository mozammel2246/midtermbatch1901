package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * You can use any other retrieval process
		 * Use any databases[ MySql] to store data and retrieve data.
		 */
		Map<String, List<String>> list = new HashMap<String, List<String>>();
		list.put("UserId", Arrays.asList("Mozammel1234")) ;
		list.put("Password", Arrays.asList("xyz123"));

		list.forEach((key, value) -> System.out.println(key + " - " + value));


	}

}
