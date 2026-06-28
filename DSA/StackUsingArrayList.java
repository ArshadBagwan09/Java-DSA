package DSA;

import java.util.ArrayList;

public class StackUsingArrayList {

    ArrayList<Integer> stack = new ArrayList<>();

    void push(int value){
     stack.add(value);
        System.out.println(value + " Added");
    }
    void pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            int removed = stack.remove(stack.size()-1);
            System.out.println(removed + " Remove");
        }
    }
    void peek(){
        if(stack.isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Top Element is "+stack.get(stack.size()-1));
        }
    }

    public static void main(String [] args){
    StackUsingArrayList ll = new StackUsingArrayList();
    ll.push(1);
    ll.push(2);
    ll.push(3);
    ll.push(4);

    ll.pop();
    ll.peek();
    }
}
