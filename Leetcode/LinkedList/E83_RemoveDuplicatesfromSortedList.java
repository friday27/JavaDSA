/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        if(p == null)
            return head;
        while(p.next != null) {
            if(p.val == p.next.val) {
                if(p.next.next != null) 
                    p.next = p.next.next;
                else
                    p.next = null;
            }else {
                p = p.next;
            }
        }
        return head;
    }
}