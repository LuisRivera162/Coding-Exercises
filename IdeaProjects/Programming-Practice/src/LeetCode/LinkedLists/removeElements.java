
// Remove all elements from a linked list of integers that have value val.

// https://leetcode.com/problems/remove-linked-list-elements/

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
        ListNode dummy = new ListNode(-1); 
        ListNode temp = head;
        dummy.next = temp;
        ListNode prev = dummy;
        
        while(temp != null){
            if(temp.val == val)
                prev.next = temp.next;
            else 
                prev = temp;
            
            temp = temp.next;
        }
        
        return dummy.next;
        
    }
    
}
