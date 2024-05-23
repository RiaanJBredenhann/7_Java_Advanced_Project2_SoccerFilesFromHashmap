// Java code to illustrate the hashCode() method

import java.util.*;

public class Abstract_Map_Demo_HashCodeMethod_Strings {
    public static void main(String[] args)
    {

        // Creating an empty AbstractMap
        AbstractMap<String, Integer>
                abs_hash = new IdentityHashMap<String, Integer>();

        // Mapping int values to string keys
        abs_hash.put("Geeks", 10);
        abs_hash.put("4", 15);
        abs_hash.put("Geeks", 20);
        abs_hash.put("Welcomes", 25);
        abs_hash.put("You", 30);

        // Displaying the AbstractMap
        System.out.println("Initial Mappings are: "
                + abs_hash);

        // Getting the hashcode value for the map
        System.out.println("The hashcode value of the map: "
                + abs_hash.hashCode());
    }
}
