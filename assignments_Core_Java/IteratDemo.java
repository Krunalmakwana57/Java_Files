package assignments_Core_Java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		System.out.println(set);
		int size = set.size();
		System.out.println("Size of HashSet = "+size);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
