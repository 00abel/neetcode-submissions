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
            ListNode next = current.next; // save the rest of the list before we cut the link
            current.next = prev; // flip this node's pointer to face backward  
            prev = current; // prev moves up to this node
            current = next; // current moves to the saved next node

        }

        return prev; // return previous as the head
        
    }
}

// time complexity: O(n) -> visit each node once
// space complexity: O(1) -> no addittional space needed
