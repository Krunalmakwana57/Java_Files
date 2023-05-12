package assignments_Core_Java;

import java.util.ArrayList;

public class AddBeforeArrayList {
	public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("green");
        colors.add("blue");
        System.out.println("Before: " + colors);

        // Insert an element at the first position
        colors.add(0, "red");
        System.out.println("After: " + colors);
    }
}
