class Solution {
    public int[][] updateMatrix(int[][] grid) {
        Queue<int[]> stack=new LinkedList<>();
        int[][] temp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==0)
                {
                    stack.add(new int[]{i,j,0});
                    temp[i][j]=-1;
                }
            }
        }
        while(!stack.isEmpty())
        {
            int[] res=stack.remove();
            int i=res[0];
            int j=res[1];
            int k=res[2];

            if(j-1>=0 && temp[i][j-1]==0)
            {
                grid[i][j-1]+=k;
                temp[i][j-1]=-1;
                stack.add(new int[]{i,j-1,grid[i][j-1]});
            }

            if(j+1<grid[0].length && temp[i][j+1]==0)
            {
                grid[i][j+1]+=k;
                temp[i][j+1]=-1;
                stack.add(new int[]{i,j+1,grid[i][j+1]});
            }

            if(i-1>=0 && temp[i-1][j]==0)
            {
                grid[i-1][j]+=k;
                temp[i-1][j]=-1;
                stack.add(new int[]{i-1,j,grid[i-1][j]});

            }
            if(i+1<grid.length && temp[i+1][j]==0)
            {
                grid[i+1][j]+=k;
                temp[i+1][j]=-1;
                stack.add(new int[]{i+1,j,grid[i+1][j]});
            }
        }
        return grid;
    }
}