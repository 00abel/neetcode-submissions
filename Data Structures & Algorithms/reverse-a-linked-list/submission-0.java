/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;

        // traverse the list
        while (current != null){
            ListNode next = current.next; // save reference to the 2nd node
            current.next = prev; // reverse the current's link to point at prev.  
            prev = current; // advance prev to current
            current = next; // advance current to next(curent.next)

        }

        return prev; // return previous as the head

        
    }
}
