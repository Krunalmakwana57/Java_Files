package assignments_Core_Java;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCopyDemo {
	public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List list2 = new ArrayList(list1);

        System.out.println("Contents of list1: " + list1);
        System.out.println("Contents of list2: " + list2);
        
    }
}
