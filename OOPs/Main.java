package OOPs;

class Student {

  String name;
  int age;

  // Constructor
  Student(Student s2) {
    this.name = s2.name;
    this.age = s2.age;
  }

  void display() {
    System.out.println(name);
    System.out.println(age);
  }

  Student() {

  }
}

public class Main {
  public static void main(String[] args) {

    Student s1 = new Student();
    s1.name = "Arshad";
    s1.age = 22; // Constructor called

    Student s2 = new Student(s1);
    s2.display();
  }
}