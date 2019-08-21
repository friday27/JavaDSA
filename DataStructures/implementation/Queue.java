public class Queue<T> implements Iterable {
    // Implement Queue using LinkedList
    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    public Queue() {}

    public Queue(T elem) {
        offer(elem);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int peek() {
        if(isEmpty())
            throws new RuntimeException("Empty Queue");
        return list.peekFirst();
    }

    public int poll() {
        if(isEmpty())
            throws new RuntimeException("Empty Queue");
        return list.removeFirst();
    }

    public void offer(T elem) {
        list.addLast(elem);
    }

    @Override
    public java.util.Iterator<T> Iterator() {
        return list.iterator();
    }

}