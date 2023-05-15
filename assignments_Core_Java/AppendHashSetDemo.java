package assignments_Core_Java;

import java.util.HashSet;
import java.util.Set;

public class AppendHashSetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();

        // Add some elements to the set
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        
        //Print the contents of set before append
        System.out.println("Contents of set: " + set);

        // Append a new element to the end of the set
        set.add("date");

        // Print the contents of the set
        System.out.println("Contents of set: " + set);
	}
}
