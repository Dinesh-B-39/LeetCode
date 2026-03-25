class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long tot=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                tot+=grid[i][j];
            }
        }
        System.out.println("total:"+tot);
        long[] temp=new long[grid.length];
        for(int i=0;i<grid.length;i++)
        {
            long p=0;
            for(int j=0;j<grid[0].length;j++)
            {
                p+=grid[i][j];
                if(tot-p==p)
                {
                    return true;
                }
            }
            temp[i]=p;
        }
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
        long y1=0;
        for(int i=0;i<temp.length;i++)
        {
            y1+=temp[i];
            if(tot-y1==y1)
            {
                return true;
            }
        }
        long[] temp2=new long[grid[0].length];
        for(int i=0;i<grid[0].length;i++)
        {
            long y=0;
            for(int j=0;j<grid.length;j++)
            {
                y+=grid[j][i];
                  if(tot-y==y)
                {
                    return true;
                }
            }
            temp2[i]=y;
        }
        for(int i=0;i<temp2.length;i++)
        {
            System.out.println(temp2[i]);
        }
        long y2=0;
        for(int i=0;i<temp2.length;i++)
        {
            y2+=temp2[i];
            if(tot-y2==y2)
            {
                return true;
            }
        }
        return false;
    }
}