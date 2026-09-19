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
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        while(head!=null)
        {
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int c=1;
        ListNode trav=head;
        ListNode z=null;
        while(trav!=null)
        {
            if(c==k)
            {
                ListNode x=trav.next;
                ListNode y=head;
                trav.next=null;
               temp.next=reverse(head);
               temp=y;
               head=x;
               trav=x;
               z=trav;
               c=1;
            
            }
            else
            {
            
                trav=trav.next;
                c+=1;
                
            }
        }
        if(z!=null)
        {
            temp.next=z;
        }
       
        return dummy.next;
    }
}