// https://leetcode.com/problems/next-greater-node-in-linked-list/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();  
        ListNode temp = head;
        
        while(temp != null){
            list.add(temp);
            temp = temp.next;
        }
        
        for(int i = 0; i < list.size(); i++){
            boolean found = false;
            for(int j = i + 1; j < list.size(); j++){
                if(list.get(j).val > list.get(i).val){
                    found = true;
                    list.get(i).val = list.get(j).val;
                    break;
                }
            }
            if(!found)
                list.get(i).val = 0;
        }
        
        int result[] = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i).val;
        
        return result;
    }
}
