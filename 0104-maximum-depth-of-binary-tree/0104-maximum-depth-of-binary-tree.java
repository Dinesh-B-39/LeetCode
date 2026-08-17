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
    int maxe=Integer.MIN_VALUE;
    public void check(TreeNode root,int depth)
    {
        if(root==null)
        {
            maxe=Math.max(maxe,depth);
            return;
        }
        check(root.left,depth+1);
        check(root.right,depth+1);
        
    }


    public int maxDepth(TreeNode root) {
        check(root,0);
        return maxe;
    }
}