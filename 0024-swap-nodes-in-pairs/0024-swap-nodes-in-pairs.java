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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode dummy=new ListNode(-1);
        ListNode trav=dummy;
        ListNode temp=head;
        while(temp!=null)
        {
            if(temp.next==null)
            {
                trav.next=temp;
                break;
            }
            else
            {
                ListNode tempo=temp.next.next;
                temp.next.next=null;
                trav.next=reverse(temp);
                temp=tempo;
                trav=trav.next.next;
            }
        }
        return dummy.next;
    }
}