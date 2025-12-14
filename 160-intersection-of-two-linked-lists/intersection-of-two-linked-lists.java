/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if (headA == null || headB == null ){
            return null;
        }
        
        

        while (headA != null){
            ListNode bhead = headB;

            while (bhead != null){
                if(headA==bhead){
                    return headA;


                }
                
                bhead = bhead.next;
                
            }
            
            
            headA = headA.next;
        }
        return null;
        
    }
}