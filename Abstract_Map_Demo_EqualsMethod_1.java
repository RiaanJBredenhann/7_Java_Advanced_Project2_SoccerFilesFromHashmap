// Java code to illustrate the equals() method
import java.util.*;

public class Abstract_Map_Demo_EqualsMethod_1 {
    public static void main(String[] args)
    {

        // Creating an empty AbstractMap
        AbstractMap<Integer, String>
                abstract_hash1 = new IdentityHashMap<Integer, String>();

        AbstractMap<Integer, String>
                abstract_hash2 = new IdentityHashMap<Integer, String>();

        // Mapping string values to int keys
        abstract_hash1.put(10, "Geeks");
        abstract_hash1.put(15, "4");
        abstract_hash1.put(20, "Geeks");
        abstract_hash1.put(25, "Welcomes");
        abstract_hash1.put(30, "You");

        // Mapping string values to int keys
        abstract_hash2.put(10, "Geeks");
        abstract_hash2.put(15, "4");
        abstract_hash2.put(20, "Geeks");
        abstract_hash2.put(25, "Welcomes");
        abstract_hash2.put(30, "You");

        // Displaying the AsbstractMap
        System.out.println("First Map: "
                + abstract_hash1);

        // Displaying the final AbstractMap
        System.out.println("Second Map: "
                + abstract_hash2);

        // Displaying the equality
        System.out.println("Equality: "
                + abstract_hash1.equals(abstract_hash2));
    }
}

