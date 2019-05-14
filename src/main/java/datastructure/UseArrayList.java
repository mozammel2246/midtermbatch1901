package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {

		/**
		 * @author Jahidul Islam
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		List<String> list =new ArrayList<>();
		list.add("add");
		list.add("peek");
		list.add("remove");
		list.add("retrieve");
		list.add("add");
		list.forEach(str -> System.out.println(str));


		ArrayList arrayList=new ArrayList();
		arrayList.add("karim");
		arrayList.add("rahim");
		arrayList.add("jamil");
		arrayList.remove(2);
		arrayList.forEach(str -> System.out.println(str));

	}

}
