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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(-1);
        ListNode even=new ListNode(-1);
        int c=1;
        ListNode temp1=odd;
        ListNode temp2=even;
        ListNode temp=head;
        while(temp!=null)
        {
            if(c%2==1)
            {
                ListNode tempo=temp.next;
                temp1.next=temp;
                temp1=temp1.next;
                temp1.next=null;
                temp=tempo;
                
            }
            else
            {
                ListNode tempo=temp.next;
                temp2.next=temp;
                temp2=temp2.next;
                temp2.next=null;
                temp=tempo;

            }
            c+=1;
        }
        temp1.next=even.next;
        return odd.next;
        
    }
}