package datastructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    /**
     * @author Jahidul Islam
     * Create a Map reference variable and store information as you like
     * Show me all possible retrieval process
     * Store map in DB
     *for (Map.Entry<String,String> entry : gfg.entrySet())
     *             System.out.println("Key = " + entry.getKey() +
     *                              ", Value = " + entry.getValue());
     * */
    public static void main(String[] args) {
        Map<Integer, String> selectedPlayer = new HashMap<>();
        selectedPlayer.put(1, "Leonel Messi");
        selectedPlayer.put(2, "Cristiano Ronaldo");
        selectedPlayer.put(3, "Karim Benzema");
        selectedPlayer.put(4, "Suarez");
        selectedPlayer.put(5, "Neimar");
        //foreach method
        selectedPlayer.forEach((key, value)-> System.out.println(key + " " + value) );
        //foreach loop
        for (Map.Entry<Integer, String> entry : selectedPlayer.entrySet()
             ) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
