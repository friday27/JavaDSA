/*
  83. Remove Duplicates from Sorted List

  Given a sorted linked list, delete all duplicates such that each element appear only once.
*/

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
        ListNode point = head;
        
        while(point != null && point.next != null){
            if(point.val == point.next.val)
                point.next = point.next.next;
            else
                point = point.next;
        }
        
        return head;
    }
}