package DSA;

public class SimpleArrayStack {
    int[] stack = new int[5];
    int top = -1;

    //push
    void push(int value){
        if(top == stack.length -1){
            System.out.println("Stack is Overflow");
        }else{
            stack[++top] = value;
            System.out.println(value + " Added");
        }
    }

    //pop
    void pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println(stack[top] + "Remove");
            top--;
        }
    }

    //peek
    void peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack is Top Element :"+stack[top]);
        }
    }
    public static void main(String [] args){
        SimpleArrayStack ss = new SimpleArrayStack();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        ss.push(4);

        ss.peek();

        ss.pop();
    }
}
