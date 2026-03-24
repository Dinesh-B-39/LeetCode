class Solution {
    int mod=12345;
    public int[][] constructProductMatrix(int[][] grid) {
        long[][] pref=new long[grid.length][grid[0].length];
        long[][] suff=new long[grid.length][grid[0].length];
        long c1=1;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                c1=(c1*grid[i][j])%mod;
                pref[i][j]=c1;
            }
        }
        c1=1;
        for(int i=grid.length-1;i>=0;i--)
        {
            for(int j=grid[0].length-1;j>=0;j--)
            {
                c1=(c1*grid[i][j])%mod;
                suff[i][j]=c1;
            }
        }
        int[][] res=new int[grid.length][grid[0].length];
        if(grid[0].length>1)
        {
            res[0][0]=(int)(suff[0][1]%mod);
            res[grid.length-1][grid[0].length-1]=(int)((pref[grid.length-1][grid[0].length-2])%mod);
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if((i==0 && j==0 || i==grid.length-1 && j==grid[0].length-1) && grid[0].length>1)
                {
                    continue;
                }
                else if(i==0 && j==0)
                {
                    res[i][j]=(int)((suff[i+1][j])%mod);
                }
                else if(i==grid.length-1 && j==grid[0].length-1)
                {
                    res[i][j]=(int)((pref[i-1][j])%mod);
                }
                else if(j==0)
                {
                    if(grid[0].length>1)
                    {
                        res[i][j]=(int)((pref[i-1][grid[0].length-1]*suff[i][j+1])%mod);
                    }
                    else
                    {
                        res[i][j]=(int)((pref[i-1][j]*suff[i+1][j])%mod);
                    }
                }
                else if(j==grid[0].length-1)
                {
                    res[i][j]=(int)((pref[i][j-1]*suff[i+1][0])%mod);
                }
                else
                {
                    res[i][j]=(int)((pref[i][j-1]*suff[i][j+1])%mod);
                }
            }
        }
        return res;
    }
}