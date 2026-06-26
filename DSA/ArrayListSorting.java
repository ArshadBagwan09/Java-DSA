package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 4, 1, 6, 5, 9));

    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }

}
