/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res=0;
    public void check(TreeNode root,int l,int h)
    {
        if(root==null)
        {
            return;
        }
        if(root.val>=l && root.val<=h)
        {
            res+=root.val;
            
        }
        check(root.left,l,h);
            check(root.right,l,h);
     
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        check(root,low,high);
        return res;
        
    }
}