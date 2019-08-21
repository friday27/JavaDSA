class MyQueue1 {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();
    
    // Push to the in stack
    public void push(int x) {
        in.push(x);
    }
    
    public int pop() {
        peek();
        return out.pop();
    }
    
    // If there's still blocks in out stack, 
    // we only need to peek() or pop() from the out stack, 
    // and leave the in stack unchanged.
    public int peek() {
        if(out.empty()) {
            while(!in.empty())
                out.push(in.pop());
        }
        return out.peek();
    }
    
    public boolean empty() {
        return in.empty() && out.empty();
    }
}


class MyQueue2 {
    Stack<Integer> queue;

    public MyQueue() {
        queue = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(queue.isEmpty())
            queue.push(x);
        else {
            Stack<Integer> temp = new Stack<Integer>();
            while(!queue.isEmpty()) {
                temp.push(queue.pop());
            }
            queue.push(x);
            while(!temp.isEmpty()) {
                queue.push(temp.pop());
            }
        }
    }
    
    public int pop() {
        return queue.pop();
    }
    
    public int peek() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */