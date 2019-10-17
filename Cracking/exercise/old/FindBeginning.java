/*
    Cracking 2.5
    Given a circular linked list, implement an algorithm which returns 
    node at the begin- ning of the loop
    
    DEFINITION
    Circular linked list: A (corrupt) linked list in which a node’s next pointer 
    points to an earlier node, so as to make a loop in the linked list
    
    EXAMPLE
    input: A -> B -> C -> D -> E -> C [the same C as earlier]
    output: C
*/

public class FindBeginning {
    public Node FindBeginning(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        if(fast.next == null) //no loop
            return null;

        //Start from head and meeting point, slow and fast will meet at the loop beginning point
        slow = head;
        while(slow != next) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
}
