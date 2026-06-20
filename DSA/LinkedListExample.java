package DSA;

class LinkedListExample {

  Node head;

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  // Add data at First
  public void addFirst(String data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  // Add data at Last
  public void addLast(String data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      return;
    }

    Node currNode = head;

    while (currNode.next != null) {
      currNode = currNode.next;
    }

    currNode.next = newNode;
  }

  // Print Linked List
  public void print() {

    if (head == null) {
      System.out.println("List is empty");
      return;
    }

    Node currNode = head;

    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }

    System.out.println("NULL");
  }

  // delete first

  public void deletefirst() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    }
    head = head.next;
  }

  // delete last
  public void deletelast() {
    if (head == null) {
      System.out.println("List is Empty");
      return;
    }
    if (head.next == null) {
      head = null;
      return;
    }
    Node secondNode = head;
    Node lastNode = head.next;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
      secondNode = secondNode.next;
    }
  }

  public static void main(String[] args) {

    LinkedListExample ll = new LinkedListExample();

    ll.addFirst("It");
    ll.addFirst("is");
    ll.addFirst("a");

    ll.print();

    ll.deletefirst();
    ll.print();

    ll.deletelast();
    ll.print();
  }
}