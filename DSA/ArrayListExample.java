package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListExample {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>();
    ArrayList<Integer> list1 = new ArrayList<Integer>( Arrays.asList(3, 4, 2, 1, 8, 2));

    System.out.println(list);

   

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list);

    int element = list.get(0);
    System.out.println(element);

    list.add(0, 0);
    System.out.println(list);

    list.set(0, 10);
    System.out.println(list);

    list.remove(2);
    System.out.println(list);

    int size = list.size();
    System.out.println(size);

    for (int i = 0; i <= list.size(); i++) {
      System.out.print(i);
    }
    System.out.println();

    Collections.sort(list);
    System.out.println(list);

    

    Collections.sort(list1);
    System.out.println(list1);

  }

}
