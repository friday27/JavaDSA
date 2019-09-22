import java.util.*;

public class SortedStack {
    static Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> temp = new Stack<Integer>();

    public void push(int val) {
        if(isEmpty()) {
            stack.push(val);
            return;
        }
        while(!isEmpty() && stack.peek() < val) {
            temp.push(stack.pop());
        }
        stack.push(val);
        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        if(isEmpty())
            throw new RuntimeException("Empty stack");
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.size() == 0;
    }

    public void show() {
        System.out.println(stack);
    }

    public static void main(String[] args) {
        SortedStack ss = new SortedStack();
        ss.push(100);
        ss.push(-100);
        ss.push(-99);
        ss.push(78);
        ss.push(0);
        ss.show();
        ss.pop();
        ss.show();
    }
}