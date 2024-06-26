// Java program to demonstrate
// AbstractMap.SimpleEntry.toString() method

import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class GFG_SimpleEntry_ToStringMethod_1 {

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args)
    {

        // create a ArrayList of Map
        ArrayList<AbstractMap
                .SimpleEntry<Integer, Integer> >
                arrayList
                = new ArrayList<AbstractMap
                .SimpleEntry<Integer, Integer> >();

        // add values
        arrayList.add(new AbstractMap.SimpleEntry(0, 123));
        arrayList.add(new AbstractMap.SimpleEntry(1, 130));
        arrayList.add(new AbstractMap.SimpleEntry(2, 994));

        // print keys
        for (int i = 0; i < arrayList.size(); i++) {

            // get map from list
            AbstractMap.SimpleEntry<Integer, Integer>
                    map
                    = arrayList.get(i);

            // get representation of map using toString()
            String value = map.toString();

            System.out.println(value);
        }
    }
}

