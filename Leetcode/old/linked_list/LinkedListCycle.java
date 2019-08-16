/*
  141. Linked List Cycle

  Given a linked list, determine if it has a cycle in it.
  To represent a cycle in the given linked list, 
  we use an integer pos which represents the position (0-indexed) 
  in the linked list where tail connects to. 
  If pos is -1, then there is no cycle in the linked list.
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        
        ListNode walker = head;
        ListNode runner = head;
        while(walker != null && runner != null && walker.next != null && runner.next != null && runner.next.next != null){
            walker = walker.next;
            runner = runner.next.next;
            if(walker == runner)
                return true;
        }
        return false;
    }
}