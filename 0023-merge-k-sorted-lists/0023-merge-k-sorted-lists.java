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
 class Pair
 {
    ListNode node;
    int val;
    Pair(ListNode node,int val)
    {
        this.node=node;
        this.val=val;
    }
 }
class Solution {
    public ListNode mergeKLists(ListNode[] list) {
        PriorityQueue<Pair> qu=new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        for(int i=0;i<list.length;i++)
        {
            if(list[i]!=null)
            {
                qu.offer(new Pair(list[i],list[i].val));
            }
            
        }
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(!qu.isEmpty())
        {
            Pair x=qu.poll();
            ListNode tempo=x.node.next;
            temp.next=x.node;
            temp=temp.next;
            temp.next=null;
            if(tempo!=null)
            {
                qu.offer(new Pair(tempo,tempo.val));
            }

        }
        return dummy.next;
    }
}