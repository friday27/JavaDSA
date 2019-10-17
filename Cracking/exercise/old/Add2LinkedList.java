/*
    Add 2 linked list

    For example:
    Input: 7 -> 5 -> 9 -> 4 -> 6, 8 -> 4
    Output: 5 -> 0 -> 0 -> 5 -> 6
*/

import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Add2LinkedList {
    public Node add2LL(Node head1, Node head2) {
        int sum = 0, num = 0;
        while(!(head1 == null && head2 == null)) {
            if(head1 != null) {
                sum += head1.data * Math.pow(10, num);
                head1 = head1.next;
            }
            if(head2 != null) {
                sum += head2.data * Math.pow(10, num);
                head2 = head2.next;
            }
            num++;
        }
        Node res = new Node(sum%10);
        Node current = res;
        sum /= 10;
        while(sum > 0) {
            current.next = new Node(sum%10);
            sum /= 10;
            current = current.next;
        }
        return res;
    }
}