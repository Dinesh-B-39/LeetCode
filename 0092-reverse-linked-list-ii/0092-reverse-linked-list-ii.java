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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null)
        {
            return head;
        }
        int c=1;
        ListNode key=null;
        ListNode temp=head;
        ListNode prev=null;
        ListNode s1=null;
        if(left==1)
        {
            s1=head;
            key=head;
        }
        else
        {
            while(temp!=null)
            {
                if(c==left)
                {
                    key=temp;
                    s1=temp;
                    break;
                }
                else
                {
                    c+=1;
                    prev=temp;
                    temp=temp.next;
                }
            }

        }
        ListNode s2=null;
        temp=s1;
        while(temp!=null)
        {
            if(c==right)
            {
                s2=temp.next;
                temp.next=null;
                break;
            }
            else
            {
                c+=1;
                temp=temp.next;
            }
        }
        ListNode tempo=reverse(s1);
        if(prev!=null)
        {
            prev.next=tempo;
        }
        else
        {
            head=tempo;
        }
        // temp=head;
        // prev=null;
        // while(temp!=null)
        // {
        //     prev=temp;
        //     temp=temp.next;
        // }
        // if(prev==null)
        // {
        //     temp.next=s2;
        //     return head;
        // }
        // prev.next=s2;
        key.next=s2;
        return head;


        
    }
}