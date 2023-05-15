package assignments_Core_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	public static void main(String[] args) {
		List numbers = new ArrayList();
        numbers.add(4);
        numbers.add(2);
        numbers.add(8);
        numbers.add(5);
        numbers.add(1);

        System.out.println("Unsorted list: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);
	}
}
