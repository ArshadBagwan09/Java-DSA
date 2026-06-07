package Condition_Statement;

import java.util.*;

public class Else {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter Your Number");
    num = sc.nextInt();
    if (num == 1) {
      System.out.println("Arhsad");
    } else if (num == 2) {
      System.out.println("Juber");
    } else if (num == 3) {
      System.out.println("Sahil");
    } else {
      System.out.println("Invalid Choice");
    }
  }
}