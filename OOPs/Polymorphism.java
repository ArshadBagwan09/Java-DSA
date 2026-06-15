package OOPs;

public class Polymorphism {
  String name;
  int age;

  public void PrintInfo(String name) {
    System.out.println("Name is : " + name);
  }

  public void PrintInfo(int age) {
    System.out.println("Your age is : " + age);
  }

  public void PrintInfo(String name, int age) {
    System.out.println("Name & age is : " + name + " " + age);
  }

  public static void main(String[] args) {
    Polymorphism pp = new Polymorphism();
    pp.name = "Arshad";
    pp.age = 22;

    pp.PrintInfo(pp.name , pp.age);
  }

}
