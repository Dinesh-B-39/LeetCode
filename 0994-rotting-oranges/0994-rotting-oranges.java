class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> stack=new LinkedList<>();
        int[][] temp=new int[grid.length][grid[0].length]; 
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    stack.add(new int[]{i,j,0});
                    temp[i][j]=2;
                }
            }
        }
        int maxe=0;
        while(!stack.isEmpty())
        {
            int[] res=stack.remove();
            int i=res[0];
            int j=res[1];
            int k=res[2];
            maxe=Math.max(maxe,k);
            if(j-1>=0 && grid[i][j-1]==1 && temp[i][j-1]!=2)
            {
                stack.add(new int[]{i,j-1,k+1});
                temp[i][j-1]=2;
            }
            if(j+1<grid[0].length && grid[i][j+1]==1 && temp[i][j+1]!=2)
            {
                 stack.add(new int[]{i,j+1,k+1});
                temp[i][j+1]=2;
            }
            if(i-1>=0 && grid[i-1][j]==1 && temp[i-1][j]!=2)
            {
                  stack.add(new int[]{i-1,j,k+1});
                temp[i-1][j]=2;
            }
             if(i+1<grid.length && grid[i+1][j]==1 && temp[i+1][j]!=2)
            {
                  stack.add(new int[]{i+1,j,k+1});
                temp[i+1][j]=2;
            }
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1 && temp[i][j]==0)
                {
                    return -1;
                }
            }
        }
        return maxe;
    }
}