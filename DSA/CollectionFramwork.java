package DSA;

import java.util.*;

public class CollectionFramwork {

  public static void main(String[] args) {

    LinkedList<String> list = new LinkedList<String>();
    ArrayList<Integer> arr = new ArrayList<Integer>();

    arr.add(23);
    arr.add(22);
    arr.add(90);
    arr.add(10);
    arr.add(1);

    System.out.println(arr);
    Collections.sort(arr);
    System.out.println(arr);

    list.add("Arshad");
    list.add("Bagwan");
    list.add("Kolhapur");
    System.out.println(list);

    list.addLast("KIT College");
    System.out.println(list);

    System.out.println(list.size());

    list.remove(2);
    System.out.println(list);

  }

}
