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
        ListNode dummy2=new ListNode(-1);
        ListNode cus=dummy2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int c=1;
        ListNode trav=head;
        boolean flag=false;
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
               flag=true;
            }
            else
            {
                // if(flag)
                // {
                //     ListNode oat=trav.next;
                //     cus.next=trav;
                //     cus=cus.next;
                //     c+=1;
                //     trav=oat;
                    
                // }
                // else
                // {
                //     trav=trav.next;
                    
                //     c+=1;
                //     cus=dummy2;
                // }
                // flag=false;
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