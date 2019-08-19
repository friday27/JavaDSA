/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Hint: The rule is to find the next smaller node and link it.

//less memory usage
class Solution1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        // base case
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        // recursion
        if(l1.val < l2.val){
            // If l1.val < l2.val, l1.next must equals the smaller one of l1.next and l2
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

// Non-recursion solution
public class Solution2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakeHead = new ListNode(0);
        ListNode pointer = fakeHead;
        while (l1 != null && l2 != null) {
            // Who's next?
            if (l1.val <= l2.val) {
                pointer.next = l1;
                l1 = l1.next;
            } else {
                pointer.next = l2;
                l2 = l2.next;
            }
            pointer = pointer.next;
        }
        if (l1 != null)
            pointer.next = l1;
        if (l2 != null)
            pointer.next = l2;
        return fakeHead.next;
    }
}