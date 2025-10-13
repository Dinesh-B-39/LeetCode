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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> res=new ArrayList<>();
        if(root==null)
        {
            return res;
        }
        
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            ArrayList<Integer> list=new ArrayList<>();
            int m=qu.size();
            for(int i=0;i<m;i++)
            {
                TreeNode node=qu.poll();
                list.add(node.val);
                if(node.left!=null)
                {
                    qu.add(node.left);
                }
                if(node.right!=null)
                {
                    qu.add(node.right);
                }

            }
            res.add(list);
        }
       return res;
    }
}