public class DoublyLinkedList<T> implements Iterable<T> {
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    // Internal node class to represent data
    class Node<T> {
        T data;
        Node<T> prev, next;

        public Node(T data) {
            this.data = data;
            this.prev = this.next = null;
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    public void clear() {
        Node<T> trav = head;
        while(trav != null) {
            Node<T> next = trav.next;
            trav.prev = trav.next = null;
            trav.data = null;
            trav = next;
        }
        head = tail = trav = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(T elem) {
        addLast(elem);
    }

    public void addLast(T elem) {
        if(isEmpty()) {
            head = tail = new Node<T>(elem);
        } else {
            tail.next = new Node<T>(elem);
            tail.next.prev = tail;
            tail = tail.next;
        }
        size++;
    }

    public void addFirst(T elem) {
        if(isEmpty()) {
            head = tail = new Node<T>(elem);
        } else {
            Node<T> node = new Node<T>(elem);
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public T peekFirst() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return head.data;
    }

    public T peekLast() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        return tail.data;
    }

    public T removeFirst() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        T data = head.data;
        head = head.next;
        size--;
        if(isEmpty())
            tail = null;
        else
            head.prev = null; // Do a memory cleanup of the previous node
        return data;
    }

    public T removeLast() {
        if (isEmpty()) throw new RuntimeException("Empty list");
        T data = tail.data;
        tail = tail.prev;
        size--;
        if(isEmpty())
            head = null;
        else
            tail.next = null;
        return data;
    }

    //Set to private since the Node class is private
    private T remove(Node<T> node) {
        // If the node to remove is somewhere either at the
        // head or the tail handle those independently
        if (node.prev == null) return removeFirst();
        if (node.next == null) return removeLast();
        
        T data = node.data;
        node.prev.next = node.next;
        node.next.prev = node.prev;

        //memory cleanup
        node.data = null;
        node = node.prev = node.next= null;

        size--;
        return data;
    }

    public T removeAt(int index) {
        // Make sure the index provided is valid -_-
        if (index < 0 || index >= size) throw new IllegalArgumentException();

        int i = 1;
        Node<T> trav;

        if (index < size/2) 
            for (i=0, trav=head; i!=index; i++) trav = trav.next;
        else 
            for (i=size-1, trav=tail; i!=index; i--) trav = trav.prev;

        return remove(trav);
    }

    // Remove a particular value in the linked list, O(n)
    public boolean remove(Object obj) {
        Node<T> trav = head;

        // Support searching for null
        if (obj == null) {
            for (trav=head; trav!=null; trav=trav.next) {
                if (trav.data == null) {
                    remove(trav);
                    return true;
                }
            }
          // Search for non null object
        } else {
            for (trav=head; trav!=null; trav=trav.next) {
                if (obj.equals(trav.data)) {
                    remove(trav);
                    return true;
                }
            }
        }
        return false;
    }

    // Find the index of a particular value in the linked list, O(n)
    public int indexOf(Object obj) {
        int i;
        Node<T> trav = head;
        for(i=0; i<size; i++) {
            if(obj.equals(trav.data))
                return i;
            else
                trav = trav.next;
        }
        return -1;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private Node<T> trav = head;

            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;
                return data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        Node<T> trav = head;
        while (trav != null) {
            sb.append(trav.data + ", ");
            trav = trav.next;
        }
        sb.append(" ]");
        return sb.toString();
    }
}