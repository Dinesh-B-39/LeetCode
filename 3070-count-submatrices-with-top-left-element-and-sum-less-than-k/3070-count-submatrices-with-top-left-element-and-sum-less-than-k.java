class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int[][] temp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid[0].length;i++)
        {
            int p=0;
            for(int j=0;j<grid.length;j++)
            {
                p+=grid[j][i];
                temp[j][i]=p;
            }
        }
        int c=0;
        for(int i=0;i<temp.length;i++)
        {
            int z=0;
            for(int j=0;j<grid[0].length;j++)
            {
                z+=temp[i][j];
                if(z<=k)
                {
                    c+=1;
                }
                else
                {
                    break;
                }
            }
        }
        return c;
    }
}