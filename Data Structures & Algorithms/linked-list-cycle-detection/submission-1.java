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
    public boolean hasCycle(ListNode head) {
        ListNode current = head;

        // create two pointers, fast(moves 2x ->) and slow(moves 1x ->)
        // both start at head
        ListNode fast = head;
        ListNode slow = head;

        // traverse the list
        while (fast != null && fast.next != null){
            fast = fast.next.next; // jump 2 nodes
            slow = slow.next; // jump 1 node

            // if there is a cycle, fast and slow will eventually meet
            // this checks if they are the same nodes in memory, not same value
            if(fast == slow){
                return true;
            }


        }

        return false; // if we find a null value return false

        // time: O(n)  -> depends on how many nodes in the list
        // space: O(1) -> we did not use extra space

        
    }
}
