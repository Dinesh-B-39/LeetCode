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
    HashMap<Integer,Integer> map=new HashMap<>();
    public void check(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        maxe=Math.max(maxe,map.get(root.val));
        check(root.left);
        check(root.right);
    }
    public int[] findMode(TreeNode root) {
        check(root);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:map.keySet())
        {
            if(map.get(i)==maxe)
            {
                list.add(i);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            res[i]=list.get(i);
        }

        return res;
    }
}