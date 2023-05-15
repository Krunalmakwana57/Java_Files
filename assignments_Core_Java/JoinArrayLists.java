package assignments_Core_Java;

import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {
   public static void main(String[] args) {
      ArrayList list1 = new ArrayList();
      list1.add(1);
      list1.add(2);
      list1.add(3);

      ArrayList list2 = new ArrayList();
      list2.add(4);
      list2.add(5);
      list2.add(6);

      List joinedList = new ArrayList();
      joinedList.addAll(list1);
      joinedList.addAll(list2);

      System.out.println("Joined list = " + joinedList);
   }
}

