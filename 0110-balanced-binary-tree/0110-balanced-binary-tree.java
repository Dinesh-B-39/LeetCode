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
    boolean flag=true;
    public int check(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int left=1+check(root.left);
        int right=1+check(root.right);
        if(Math.abs(right-left)>1)
        {
            flag=false;
        }
        return Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        int p=check(root);
        return flag;
        
    }
}