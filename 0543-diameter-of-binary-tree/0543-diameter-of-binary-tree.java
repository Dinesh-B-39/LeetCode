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
    int maxe=0;
    public int check(TreeNode root)
    {
        if(root.left==null && root.right==null)
        {
            return 0;
        }
        int left=0;
        int right=0;
        if(root.left!=null)
        {
            left=1+check(root.left);
        }
        if(root.right!=null)
        {
            right=1+check(root.right);
        }
        maxe=Math.max(maxe,left+right);
        return Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int p=check(root);
        return maxe;
        
    }
}