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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=head;
        int z=-2;
        ListNode dummy=new ListNode(-1);
        ListNode trav=dummy;
        while(temp!=null)
        {
            if(temp.val!=z)
            {
                ListNode vis=new ListNode(temp.val);
                trav.next=vis;
                z=temp.val;
                trav=trav.next;
                
            }
            temp=temp.next;
            
        }
        return dummy.next;
    }
}