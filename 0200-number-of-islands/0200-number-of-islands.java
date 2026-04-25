class Solution {
   
    public void check(int i,int j,char[][] grid,int[][] temp)
    {
        temp[i][j]=-1;
        //top
        if(i-1>=0 && grid[i-1][j]=='1' && temp[i-1][j]!=-1)
        {
            check(i-1,j,grid,temp);
            
        }
        //left
        if(j-1>=0 && grid[i][j-1]=='1' && temp[i][j-1]!=-1)
        {
            check(i,j-1,grid,temp);
        }

        //right
        if(j+1<grid[0].length && grid[i][j+1]=='1' && temp[i][j+1]!=-1)
        {
            check(i,j+1,grid,temp);
        }
        //bottom
        if(i+1<grid.length && grid[i+1][j]=='1' && temp[i+1][j]!=-1)
        {
            check(i+1,j,grid,temp);
        }
        return;
    }
    public int numIslands(char[][] grid) {
        int tot=0;
        int[][] temp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(temp[i][j]!=-1 && grid[i][j]=='1')
                {
                    check(i,j,grid,temp);
                    tot+=1;
                }
            }
        }
        return tot;
    }
}