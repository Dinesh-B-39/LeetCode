class Solution {
    public int check(int i,int j,char[][] grid,int[][] temp)
    {
        temp[i][j]=-1;
        //left
        if(j-1>=0 && grid[i][j-1]=='1' && temp[i][j-1]==0)
        {
            j-=1;
            check(i,j,grid,temp);
            j+=1;
        }
        //right
        if(j+1<grid[0].length && grid[i][j+1]=='1' && temp[i][j+1]==0)
        {
            j+=1;
            check(i,j,grid,temp);
            j-=1;
        }
        //top
        if(i-1>=0 && grid[i-1][j]=='1' && temp[i-1][j]==0)
        {
            i-=1;
             check(i,j,grid,temp);
             i+=1;
        }
        //down
        if(i+1<grid.length && grid[i+1][j]=='1' && temp[i+1][j]==0)
        {
            i+=1;
            check(i,j,grid,temp);
            i-=1;
        }
        return 1;
    }
    public int numIslands(char[][] grid) {
        int[][] temp=new int[grid.length][grid[0].length];
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1' && temp[i][j]==0)
                {
                    c+=check(i,j,grid,temp);
                }
            }
        }
        return c;
    }
}