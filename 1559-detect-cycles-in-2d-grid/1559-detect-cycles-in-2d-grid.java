class Solution {
    boolean flag=false;
    public void check(int i,int j,char[][] grid,int[][] temp,int p1,int p2)
    {
        //top
        if(flag==true)
        {
            return;
        }
        if(i-1>=0 && grid[i-1][j]==grid[i][j])
        {
            if(temp[i-1][j]!=-1)
            {
                temp[i-1][j]=-1;
                check(i-1,j,grid,temp,i,j);
            }
            else if(temp[i-1][j]==-1 && (i-1!=p1 && j!=p2))
            {
                flag=true;
             
                return;
            }
        }

        //down
        if(i+1<grid.length && grid[i+1][j]==grid[i][j])
        {
            if(temp[i+1][j]!=-1)
            {
                temp[i+1][j]=-1;
                check(i+1,j,grid,temp,i,j);

            }
            else if(temp[i+1][j]==-1 && (i+1!=p1 && j!=p2))
            {
                flag=true;
               
                return;
            }

        }

        //left
        if(j-1>=0 && grid[i][j-1]==grid[i][j])
        {
            if(temp[i][j-1]!=-1)
            {
                temp[i][j-1]=-1;
                check(i,j-1,grid,temp,i,j);
            }
            else if(temp[i][j-1]==-1 && (i!=p1 && j-1!=p2))
            {
                flag=true;
               
                return;
            }
        }
        //right
        if(j+1<grid[0].length && grid[i][j+1]==grid[i][j])
        {
            if(temp[i][j+1]!=-1)
            {
                temp[i][j+1]=-1;
                check(i,j+1,grid,temp,i,j);
            }
            else if(temp[i][j+1]==-1 && (i!=p1 && j+1!=p2))
            {
                flag=true;
               
                return;
            }

        }
    }
    public boolean containsCycle(char[][] grid) {
        int[][] temp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                flag=false;
                if(temp[i][j]!=-1)
                {
                    temp[i][j]=-1;
                    check(i,j,grid,temp,-1,-1);
                    if(flag==true)
                    {
                        return true;
                    }
                }
                
            }
        }
        return false;
    }
}