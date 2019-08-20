class MinStack1 {
    Node head;
    
    class Node {
        int val, min;
        Node next;
        Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    public void push(int x) {
        head = new Node(x, Math.min(x, head.min), head);
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}


class MinStack2 {
    /** initialize your data structure here. */
    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(x <= min){
            stack.push(min); //push the old minimum!!!
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.pop() == min)
            min = stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */