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
    public void check(TreeNode root,int c)
    {
        if(root==null)
        {
            return;
        }
        if(root.left==null && root.right==null)
        {
            maxe=Math.max(maxe,c+1);
            return;
        }
        check(root.left,c+1);
        check(root.right,c+1);

    }
    public int maxDepth(TreeNode root) {
        check(root,0);
        return maxe;
    }
}