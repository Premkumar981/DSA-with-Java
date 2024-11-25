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
    public int sizeLL(ListNode head){
        int count = 0;
        ListNode ptr = head;
        
        while(ptr!=null){
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null){
            return null;
        }
        int size1 = sizeLL(headA);
        int size2 = sizeLL(headB);

        int diff = size1 - size2;
        ListNode p1 = headA;
        ListNode p2 = headB;

        if(diff>0){
            while(diff>0){
                p1 = p1.next;
                diff--;
            }
        }else{
            while(diff<0){
                p2 = p2.next;
                diff++;
            }
        }
        while(p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
//premkumarsuru
