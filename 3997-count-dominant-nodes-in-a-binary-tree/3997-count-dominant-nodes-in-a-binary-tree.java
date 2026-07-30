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
    int c=0;
    public int check(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int s1=check(root.left);
        int s2=check(root.right);
        if(root.val>=s1 && root.val>=s2)
        {
            System.out.println(root.val);
            c+=1;
        }
        return Math.max(root.val,Math.max(s1,s2));
    }
    public int countDominantNodes(TreeNode root) {
        check(root);
        return c;
    }
}