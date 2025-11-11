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
    public int pairSum(ListNode head) {
        int maxe=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null)
        {
            list.add(temp.val);
            temp=temp.next;
        }
        for(int i=0;i<list.size()/2;i++)
        {
            maxe=Math.max(maxe,list.get(i)+list.get(list.size()-1-i));
        }
        return maxe;
        
    }
}