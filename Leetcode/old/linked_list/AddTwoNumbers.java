/*
  [Medium] 2. Add Two Numbers

  You are given two non-empty linked lists representing two non-negative integers. 
  he digits are stored in reverse order and each of their nodes contain a single digit. 
  Add the two numbers and return it as a linked list.
  You may assume the two numbers do not contain any leading zero, 
  except the number 0 itself.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode point = ans;
        int sum = 0;
        while(l1 != null || l2 != null){
            sum /= 10;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            point.next = new ListNode(sum % 10);
            point = point.next;
        }
        if(sum/10>0){
            point.next = new ListNode(sum/10);   
        }
        return ans.next;
    }
}