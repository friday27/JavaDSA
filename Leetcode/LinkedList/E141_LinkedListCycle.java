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

// Runtime: 100%, Memory Usage: 100%
public class Solution1 {
    public boolean hasCycle(ListNode head) {
        ListNode walker = head, runner = head;
        while(runner != null && runner.next != null) {
            walker = walker.next;
            runner = runner.next.next;
            if(runner == walker)
                return true;
        }
        return false;
    }
}

// Runtime: 7.51%, Memory Usage: 85%
public class Solution2 {
    public boolean hasCycle(ListNode head) {
        ListNode current = head, temp;
        int idx = 0;
        while(current != null) {
            //Check every nodes before current
            temp = head;
            for(int i=0; i<idx; i++) {
                if(temp == current)
                    return true;
                temp = temp.next;
            }
            current = current.next;
            idx++;
        }
        return false;
    }
}