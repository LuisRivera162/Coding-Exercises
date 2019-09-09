// Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = new ListNode(0);
        ListNode temp = head; 
        
        while(true){
            int counter = lists.length;
            int min = Integer.MAX_VALUE; 
            ListNode lowestNode = null; 
            int position = -1;
            
            for(int i = 0; i < lists.length; i++){
                ListNode node = lists[i]; 
                if(node != null){
                    if(node.val < min){
                        min = node.val;
                        lowestNode = node;
                        position = i;
                    }
                }
                else
                    counter--;
            }
            
            if(counter == 0)
                break; 
            
            temp.next = lowestNode; 
            lists[position] = lowestNode.next; 
            temp = temp.next; 
            
            
        }
        return head.next; 
    }
}

// First attempt on this, deffinatelly room for improvement as this algorithm is very slow, will look into the "collect and sort" 
// solution in order to implement this faster. As for now, just wanted to post the first idea that I had in mind when I
// tackled this problem. 
