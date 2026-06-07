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
    boolean flag=false;
    public void check(TreeNode root,int k,int c)
    {
        if(root==null || flag)
        {
            return;
        }
        c+=root.val;
        if(root.left==null && root.right==null)
        {
            if(c==k)
            {
                flag=true;
            }
            c-=root.val;
            return;
        }
        check(root.left,k,c);
        check(root.right,k,c);
        c-=root.val;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        check(root,targetSum,0);
        return flag;
        
    }
}