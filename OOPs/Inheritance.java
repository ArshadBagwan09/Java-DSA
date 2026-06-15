package OOPs;

class Car {
  String color;
}

class Print extends Car {

}

public class Inheritance {

  public static void main(String[] args) {
    Print pp = new Print();
    pp.color = "Red";
    System.out.println(pp.color);
  }
}