/*
  [Medium] 19. Remove Nth Node From End of List
  
  Given a linked list, remove the n-th node from the end of list and 
  return its head. (Note:Given n will always be valid.)

  Example:
  Given linked list: 1->2->3->4->5, and n = 2.
  After removing the second node from the end, the linked list becomes 1->2->3->5.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.util.Stack;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n == 0)
            return head;
        Stack<ListNode> temp1 = new Stack<ListNode>();
        Stack<ListNode> temp2 = new Stack<ListNode>();
        ListNode point = head;
        while(point != null){
            temp1.push(point);
            point = point.next;
        }
        for(int i=0;i<n;i++)
            temp2.push(temp1.pop());
        temp2.pop();
        if(temp1.empty() == true && temp2.empty() == true)
            return null;
        else if(temp1.empty() == true && temp2.empty() == false)
            return temp2.pop();
        else if(temp1.empty() == false && temp2.empty() == true)
            temp1.pop().next = null;
        else
            temp1.pop().next = temp2.pop();
        return head;
    }
}