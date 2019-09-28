// Given a singly linked list, group all odd nodes together followed by the even nodes.
// Please note here we are talking about the node number and not the value in the nodes.

// You should try to do it in place. The program should run in O(1) space complexity and
// O(nodes) time complexity.

// https://leetcode.com/problems/odd-even-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null; 
        
        ListNode oddTemp = head, evenTemp = head.next; 
        ListNode oddHead = oddTemp;
        ListNode evenHead = evenTemp; 
        
        while(evenTemp != null && oddTemp != null){
            if(oddTemp.next != null)
                oddTemp.next = oddTemp.next.next;
            oddTemp = oddTemp.next; 
            if(evenTemp.next != null)
                evenTemp.next = evenTemp.next.next;
            evenTemp = evenTemp.next;
            
        }
        
        ListNode oddEnd = oddHead; 
        while(oddEnd.next != null)
            oddEnd = oddEnd.next; 
        
        oddEnd.next = evenHead; 
        
        return oddHead; 
    }
}
