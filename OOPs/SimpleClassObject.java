package OOPs;

class Student {
  String name;
  int age;

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

public class SimpleClassObject {
  public static void main(String[] args) {

    Student s1 = new Student(); // object creation
    Student ss = new Student();

    s1.name = "Rahul";
    s1.age = 20;

    ss.name = "Arshad";
    ss.age = 22;

    s1.display();
    ss.display();
  }
}