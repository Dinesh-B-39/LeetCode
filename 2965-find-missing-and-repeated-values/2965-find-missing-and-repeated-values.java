class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res=new int[2];
        int[] vis=new int[(grid.length*grid.length)+1];
        Arrays.fill(vis,-1);
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(vis[grid[i][j]]==-1)
                {
                    vis[grid[i][j]]=1;
                }
                else
                {
                    res[0]=grid[i][j];
                }
            }
        }
        for(int i=1;i<vis.length;i++)
        {
            if(vis[i]==-1)
            {
                res[1]=i;
                break;
            }
        }
        return res;
    }
}