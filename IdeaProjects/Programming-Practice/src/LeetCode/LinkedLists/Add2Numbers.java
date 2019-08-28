//You are given two non-empty linked lists representing two non-negative integers. 
//The digits are stored in reverse order and each of their nodes contain a single digit. 
//Add the two numbers and return it as a linked list.

//You may assume the two numbers do not contain any leading zero, except the number 0 itself.


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
        int carry = 0; 
        ListNode head = new ListNode(0); 
        ListNode temp = head;
        
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry; 
            if(sum >= 10){
                carry = 1;
                sum = sum % 10; 
            }
            else 
                carry = 0;
            temp.next = new ListNode(sum); 
            temp = temp.next; 
            l1 = l1.next; l2 = l2.next; 
        }
        
        while(l1 == null && l2 != null){
            int sum = l2.val + carry; 
            if(sum >= 10){
                carry = 1;
                sum = sum % 10; 
            }
            else 
                carry = 0;
            temp.next = new ListNode(sum); 
            temp = temp.next; 
            l2 = l2.next; 
        }
        
        while(l1 != null && l2 == null){
            int sum = l1.val + carry; 
            if(sum >= 10){
                carry = 1;
                sum = sum % 10; 
            }
            else 
                carry = 0;
            temp.next = new ListNode(sum); 
            temp = temp.next; 
            l1 = l1.next;
        }
        
        if (carry == 1)
            temp.next = new ListNode(1);
        
        return head.next; 
    }
}
