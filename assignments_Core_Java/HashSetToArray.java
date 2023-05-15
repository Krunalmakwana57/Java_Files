package assignments_Core_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {
   public static void main(String[] args) {
      HashSet<String> set = new HashSet<String>();
      set.add("Java");
      set.add("C++");
      set.add("Python");
      set.add("JS");

      String[] arr = new String[set.size()];
      set.toArray(arr);

      System.out.println("Hash Set: " + set);
      System.out.println("Array: " + Arrays.toString(arr));
      
      ArrayList<String> al = new ArrayList<String>(set);
      
      System.out.println("ArrayList: " + al);
   }
}


