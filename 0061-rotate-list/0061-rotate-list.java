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
    public ListNode check(ListNode head,ListNode temp,ListNode s1)
    {
        if(head==null)
        {
            return temp;
        }
        ListNode temp2=new ListNode(head.val);
        temp2.next=temp;
        if(head==s1)
        {
            temp2.next=null;
        }
         return check(head.next,temp2,s1);

    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return head;
        }
        ListNode temp=head;
        int tot=0;
        while(temp!=null)
        {
            tot+=1;
            temp=temp.next;
        }
        k=k%tot;
        int p=tot-k;
        if(p==tot)
        {
            return head;
        }
        ListNode temp1=null;
        // ListNode temp2=null;
        temp=head;
        int z=0;
        while(temp!=null)
        {
            z+=1;
            if(z==p)
            {
                temp1=temp.next;
                temp.next=null;
                break;
            }
            temp=temp.next;

        }
        ListNode temp2=null;
        ListNode neon=temp1;
        while(neon!=null)
        {
            if(neon.next==null)
            {
                neon.next=head;
                break;
            }
            neon=neon.next;
        }
    //    temp1.next=head;
       return temp1;



        // return check(head,temp,head);
        
    }
}