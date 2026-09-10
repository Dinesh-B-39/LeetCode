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
    public int count(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int s1=1+count(root.left);
        int s2=count(root.right);
        return s1+s2;
    }
    public int check(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l1=root.val+check(root.left);
        int l2=check(root.right);
         int c1=count(root);
        int avg=(l1+l2)/(c1);
        if(root.val==avg)
        {
            res+=1;
        }
        return l1+l2;

    }
    public int averageOfSubtree(TreeNode root) {
        check(root);
        return res;
    }
}