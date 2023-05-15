package assignments_Core_Java;

import java.util.HashMap;

public class CheckMapEmpty {
   public static void main(String[] args) {
      // Creating a new HashMap
      HashMap map = new HashMap();

      // Checking if the map is empty
      if (map.isEmpty()) {
         System.out.println("Map is empty");
      } else {
         System.out.println("Map is not empty");
      }

      // Adding elements to the map
      map.put(1, "Java");
      map.put(2, "C++");
      map.put(3, "Python");

      // Checking if the map is empty
      if (map.isEmpty()) {
         System.out.println("Map is empty");
      } else {
         System.out.println("Map is not empty");
      }
   }
}

