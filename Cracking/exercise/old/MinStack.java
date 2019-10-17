import java.util.Stack;

public class MinStack extends Stack<Integer> {
    Stack<Integer> minStack = new Stack<>();

    public void push(int value) {
        if(isEmpty() || value < minStack.peek())
            minStack.push(value);
        else
            minStack.push(minStack.peek());
        super.push(value);
    }

    public Integer pop() {
        minStack.pop();
        return super.pop();
    }

    public Integer peek() {
        return super.peek();
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(3);
        ms.push(-1);
        ms.push(27);
        ms.push(6);
        System.out.println(ms.peek());
        ms.pop();
        ms.pop();
        ms.pop();
        System.out.println(ms.getMin());
    }
}