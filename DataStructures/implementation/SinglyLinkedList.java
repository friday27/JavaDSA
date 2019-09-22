class SinglyLinkedList {
    int size = 0;
    Node head;

    class Node {
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

    void add(int val) {
        if(isEmpty()) {
            head = new Node(val, null);
        }else {
            Node node = new Node(val, head);
            head = node;
        }
    }

    boolean search(int val) {
        if(isEmpty())
            return false;
        Node current = head;
        while(current != null) {
            if(current.val == val)
                return true;
            current = current.next;
        }
        return false;
    }

    boolean remove(int val) {
        if(isEmpty())
            return false;
        Node current = head, prev = null;
        while(current != null) {
            if(current.val == val) {
                prev.next = current.next;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    boolean isEmpty() {
        return head == null;
    }

}