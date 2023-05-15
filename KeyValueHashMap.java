package assignments_Core_Java;

import java.util.HashMap;
import java.util.Map;

public class KeyValueHashMap {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "java");
		map.put(2, "C++");
		map.put(3, "Python");
		map.put(4, "Php");
		System.out.println(map);
		
		int size = map.size();
		
		System.out.println("The map contains " + size + " key-value mappings.");
		
		 
		 
	}
}
