package assignments_Core_Java;

import java.util.ArrayList;

public class ArrayListIterateDemo {
	 public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<String>();
	        colors.add("red");
	        colors.add("green");
	        colors.add("blue");

	        // Iterate through all elements in the ArrayList
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
}
