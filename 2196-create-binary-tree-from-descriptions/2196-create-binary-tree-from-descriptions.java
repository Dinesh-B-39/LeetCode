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
    public TreeNode buildTree(TreeNode root,HashMap<Integer,int[]> map,int data)
    {
        // if(root==null)
        // {

        //     return root;
        // }
          if(!map.containsKey(root.val))
    {
        return root;
    }
        if(map.get(root.val)[0]!=0)
        {
            root.left=new TreeNode(map.get(root.val)[0]);
            buildTree(root.left,map,map.get(root.val)[0]);
        }
        if(map.get(root.val)[1]!=0)
        {
            root.right=new TreeNode(map.get(root.val)[1]);
            buildTree(root.right,map,map.get(root.val)[1]);
        }
        return root;
        
    }
    public TreeNode createBinaryTree(int[][] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(set.add(arr[i][1]));
        }
        int root1=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i][0]))
            {
                root1=arr[i][0];
                break;
            }
        }
        TreeNode root=new TreeNode(root1);
        HashMap<Integer,int []> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i][0]))
            {
                map.put(arr[i][0],new int[2]);
                if(arr[i][2]==1)
                {
                    map.get(arr[i][0])[0]=arr[i][1];
                }
                else
                {
                    map.get(arr[i][0])[1]=arr[i][1];
                }

            }
            else
            {
                if(map.get(arr[i][0])[0]==0)
                {
                    map.get(arr[i][0])[0]=arr[i][1];
                }
                else
                {
                    map.get(arr[i][0])[1]=arr[i][1];
                }
            }
        }
        // for(int i:map.keySet())
        // {
        //     System.out.print(i+"->");
        //     System.out.print(map.get(i)[0]+","+map.get(i)[1]);
        //     System.out.println();
        // }
             return buildTree(root,map,root1);
            // return root;
        
    }
}