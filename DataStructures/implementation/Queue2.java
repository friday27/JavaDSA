public class Queue2 {
    int size;
    Node head, tail;

    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public Queue2() {
        size = 0;
        head = null;
        tail = null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int peek() {
        if(isEmpty())
            throw new RuntimeException("Empty Queue");
        return head.val;
    }

    public int poll() {
        if(isEmpty())
            throw new RuntimeException("Empty Queue");
        Node remove = head;
        head = head.next;
        size--;

        // Node current = head;
        // while(current != null) {
        //     System.out.print(current.val+" ");
        //     current = current.next;
        // }
        // System.out.println();

        return remove.val;
    }

    public void offer(int elem) {
        if(isEmpty()) {
            head = tail = new Node(elem);
        }else {
            tail.next = new Node(elem);
            tail = tail.next;
        }
        size++;

        // Node current = head;
        // while(current != null) {
        //     System.out.print(current.val+" ");
        //     current = current.next;
        // }
        // System.out.println();
    }

    public static void main(String[] args) {
        Queue2 q = new Queue2();
        q.offer(11);
        q.offer(12);
        System.out.println(q.poll());
        q.offer(25);
        q.offer(27);
        q.offer(28);
        System.out.println(q.poll());
        System.out.println(q.peek());
    }
}