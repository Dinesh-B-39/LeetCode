class Solution {
    public void check(int ind,int[] vis,int[][] arr)
    {
        for(int i=0;i<arr[0].length;i++)
        {
            if(arr[ind][i]==1 && vis[i]!=-1)
            {
                vis[i]=-1;
                check(i,vis,arr);
            }
        }
    }
    public int findCircleNum(int[][] arr) {
        int[] vis=new int[arr.length];
        int c=0;
        for(int i=0;i<vis.length;i++)
        {
            if(vis[i]!=-1)
            {
                vis[i]=-1;
                c+=1;
                check(i,vis,arr);
            }

        }
        return c;
    }
}