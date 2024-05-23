// Java code to illustrate the hashCode() method

import java.util.*;

public class Abstract_Map_Demo_HashCodeMethod_Integer {
    public static void main(String[] args)
    {

        // Creating an empty AbstractMap
        AbstractMap<Integer, String>
                abs_map = new IdentityHashMap<Integer, String>();

        // Mapping string values to int keys
        abs_map.put(10, "Geeks");
        abs_map.put(15, "4");
        abs_map.put(20, "Geeks");
        abs_map.put(25, "Welcomes");
        abs_map.put(30, "You");

        // Displaying the AbstractMap
        System.out.println("Initial Mappings are: "
                + abs_map);

        // Getting the hashcode value for the map
        System.out.println("The hashcode value of the map: "
                + abs_map.hashCode());
    }
}

