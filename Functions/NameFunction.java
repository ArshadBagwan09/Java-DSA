package Functions;

import java.util.*;

public class NameFunction {
  public static void NamePrint(String name) {
    System.out.println(name);
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Name");
    String name = sc.nextLine();

    NamePrint(name);
  }
}
