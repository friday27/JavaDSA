// Runtime: 46 ms, faster than 81.66%
// Memory Usage: 38.4 MB, less than 25.00% 

class MyCircularQueue {
    LinkedList<Integer> queue = new LinkedList<Integer>();
    int size = 0, limit;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        limit = k;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        queue.offer(value);
        size++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty())
            return false;
        queue.poll();
        size--;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty())
            return -1;
        return queue.peekFirst();
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty())
            return -1;
        return queue.peekLast();
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size == limit;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */