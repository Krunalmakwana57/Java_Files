package assignments_Core_Java;

import java.util.ArrayList;
import java.util.List;

public class CompareTwoArrayList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		List list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
//		list1.add(5);
		
		boolean cmp = list.equals(list1);
		
		if(cmp) {
			System.out.println("Both ArrayList are Same");
		}else {
			System.out.println("Both ArrayList are Not Same");
		}
	}
}
