class Solution {
    public int check(int i1,int j1,int k,int[][] grid)
    {
        int[] arr=new int[k*k];
        int p=0;
        for(int i=i1;i<i1+k;i++)
        {
            for(int j=j1;j<j1+k;j++)
            {
                arr[p]=grid[i][j];
                p+=1;
            }
        }
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]!=arr[j])
                {
                    mine=Math.min(mine,Math.abs(arr[i]-arr[j]));
                }
            }
        }
        if(mine==Integer.MAX_VALUE)
        {
            return 0;
        }
        return mine;
    }
    public int[][] minAbsDiff(int[][] grid, int k) {
        int[][] res=new int[grid.length-k+1][grid[0].length-k+1];
        for(int i1=0;i1<=grid.length-k;i1++)
        {
            int p=0;
           for(int j1=0;j1<=grid[0].length-k;j1++)
           {
                res[i1][p]=check(i1,j1,k,grid);
                p+=1;
           }
            
        }
        return res;
    }
}