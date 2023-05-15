package assignments_Core_Java;

import java.util.ArrayList;

public class SizeOfArrayList {
	public static void main(String[] args) {
	    
	    // Creating an ArrayList with initial size 5
	    ArrayList<Integer> list = new ArrayList<Integer>(5);

	    // Adding elements to the ArrayList
	    list.add(1);
	    list.add(2);
	    list.add(3);
	    list.add(4);
	    list.add(5);

	    // Increasing the capacity of the ArrayList to 10
	    list.ensureCapacity(10);

	    // Adding more elements to the ArrayList
	    list.add(6);
	    list.add(7);
	    list.add(8);
	    list.add(9);
	    list.add(10);

	    // Printing the ArrayList
	    System.out.println("ArrayList elements:");
	    for(Integer num : list) {
	        System.out.print(num + " ");
	    }
	  }
}
