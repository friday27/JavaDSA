/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode prev = fakeHead, p = head; //pointer
        while(prev != null && p != null) {
            if(p.val == val) {
                prev.next = p.next;
            }else {
                prev = prev.next;
            }
            p = prev.next;
        }
        return fakeHead.next;
    }
}