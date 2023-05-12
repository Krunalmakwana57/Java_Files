package assignments_Core_Java;

import java.util.ArrayList;

public class SpecificIndex {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        // Retrieve an element at a specified index
        String color = colors.get(1);
        System.out.println("Element at index 1: " + color);
    }
}

