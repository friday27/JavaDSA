public class Stack<T> implements Iterable<T> {
    // Use doubly linked list to implement stack
    private java.util.LinkedList<T> list = new java.util.LinkedList<T>();

    // Create an empty stack
    public Stack() {}

    public Stack(T elem) {
        push(elem);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void push(T elem) {
        list.addLast(elem);
    }

    public T pop() {
        if(isEmpty())
            throw new java.util.EmptyStackException();
        return list.removeLast();
    }

    public T peek() {
        if(isEmpty())
            throw new java.util.EmptyStackException();
        return list.peekLast();
    }

    // Allow users to iterate the stack using an iterator
    @Override
    public java.util.Iterator<T> Iterator() {
        return list.iterator();
    }
}