 public class Stack2 {
    int size;
    Node top;

    class Node() {
        int val;
        Node next;
        Node(int v) {
            this.val = v;
            this.next = null;
        }
        Node(int v, Node next) {
            this.val = v;
            this.next = next;
        }
    }

    public Stack2() {
        size = 0;
        top = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int elem) {
        if(top == null) {
            top = new Node(elem);
        }else {
            Node newNode = new Node(elem, top);
            top = newNode;
        }
        size++;
    }

    public T pop() {
        if(isEmpty())
            throw new java.util.EmptyStackException();
        Node remove = top;
        top = top.next;
        size--;
        return remove.val;
    }

    public T peek() {
        if(isEmpty())
            throw new java.util.EmptyStackException();
        return top.val;
    }
}