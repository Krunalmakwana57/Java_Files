package assignments_Core_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayListDemo {
	public static void main(String[] args) {
		List list = new ArrayList();

        // Add some elements to the list
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("pineapple");
        list.add("strawberry");

        System.out.println("The Normal list is: " + list);
        // Reverse the order of the elements using the reverse() method
        Collections.reverse(list);
        Collections.swap(list, 1, 3);
        
        System.out.println("The Swap list is: " + list);
        
        List subList = new ArrayList(list.subList(1, 4));

        // Print the reversed list to the console
        System.out.println("The reversed list is: "+list);
        System.out.println("The Extract Portion list is: " + subList);
	}
}
