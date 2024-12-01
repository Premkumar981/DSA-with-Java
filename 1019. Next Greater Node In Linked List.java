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
    public int size(ListNode head){
        ListNode curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            curr = curr.next;
        }
        return count;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr!=null){
            ListNode temp = curr.next;

            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = size(head);
        int[] arr = new int[size];
        ListNode nhead = reverse(head);

        Stack<Integer> stk = new Stack<>();
        stk.push(nhead.val);

        ListNode curr = nhead.next;
        int ptr = size-2;
        while(ptr>=0){
            int ele = curr.val;
            curr = curr.next;

            while(stk.size()>0 && stk.peek()<=ele){
                stk.pop();
            }
            if(stk.size()==0){
                arr[ptr] = 0;
            }else{
                arr[ptr] = stk.peek();
            }
            stk.push(ele);
            ptr--;
        }
        return arr;
    }
}
//premkumarsuru
