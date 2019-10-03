import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    public void push(int value) {
        if(isEmpty() || value < minStack.peek())
            minStack.push(value);
        else
            minStack.push(minStack.peek());
        stack.push(value);
    }

    public int pop() {
        minStack.pop();
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int getMin() {
        return minStack.peek();
    }
}