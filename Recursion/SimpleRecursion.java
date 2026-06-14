package Recursion;

public class SimpleRecursion {

  public static int SimpleExample(int x, int n) {
    
    if (n == 0) {
      return 1;
    }

    if (n % 2 == 0) {
      int halfPower = SimpleExample(x, n / 2);
      return halfPower * halfPower;
    } else {
      int halfPower = SimpleExample(x, n / 2);
      return x * halfPower * halfPower;
    }
  }

  public static void main(String[] args) {
    int x = 2, n = 5;
    int ans = SimpleExample(x, n);
    System.out.println(ans);
  }
}