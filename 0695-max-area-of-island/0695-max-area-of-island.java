class Solution {
    
    public int check(int[][] grid,int i,int j,int[][] temp,int z)
    {
        int c=1;
         temp[i][j]=-1;
     
        //left
        if(j-1>=0 && grid[i][j-1]==1 && temp[i][j-1]==0)
        {
            // c+=1;
            // j-=1;
            c+=check(grid,i,j-1,temp,c); 
            // j+=1;
        }

        //right
        if(j+1<grid[0].length && grid[i][j+1]==1 && temp[i][j+1]==0)
        {
            // c+=1;
            // j+=1;
            c+=check(grid,i,j+1,temp,c);
            // j-=1;
        }

        //top
        if(i-1>=0 && grid[i-1][j]==1 && temp[i-1][j]==0)
        {
            // c+=1;
            // i-=1;
            c+=check(grid,i-1,j,temp,c);
            // i+=1;
        }

        //bottom
        if(i+1<grid.length && grid[i+1][j]==1 && temp[i+1][j]==0)
        {
            // c+=1;
            // i+=1;
            c+=check(grid,i+1,j,temp,c);
            // i-=1;
        }
        return c;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int[][] temp=new int[grid.length][grid[0].length];
        int maxe=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
               
                if(grid[i][j]==1 && temp[i][j]!=-1)
                {
                   
                    maxe=Math.max(maxe,check(grid,i,j,temp,0));
                }
            }
        }
        return maxe;
    }
}