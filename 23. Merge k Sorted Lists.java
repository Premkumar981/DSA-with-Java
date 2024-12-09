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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }else if(lists.length == 1){
            return lists[0];
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++){
            ListNode t_head = lists[i];

            while(t_head!=null){
                pq.add(t_head);
                t_head = t_head.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;

        while(pq.size()>0){
            ListNode chee = pq.remove();
            dummy.next = chee;
            dummy = dummy.next;
        }
        dummy.next = null;
        return ans.next;
    }
}
//premkumarsuru
