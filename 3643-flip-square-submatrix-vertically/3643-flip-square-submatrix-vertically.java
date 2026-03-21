class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int z=x+k-1;
        for(int i=x;i<x+(k/2);i++)
        {
            for(int j=y;j<y+k;j++)
            {
                // if(i+z-1<grid.length)
                // {
                int temp=grid[i][j];
                grid[i][j]=grid[z][j];
                grid[z][j]=temp;
                // }
               
            }
             z-=1;
        }
       return grid; 
    }
}