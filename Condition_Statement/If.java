package Condition_Statement;

import java.util.*;

public class If {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age;
    System.out.println("Enter Your Age");
    age = sc.nextInt();
    if (age == 18) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
