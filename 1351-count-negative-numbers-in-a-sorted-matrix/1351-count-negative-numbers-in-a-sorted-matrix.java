class Solution {
    public int check(int[] arr)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>=0)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return arr.length-low;
    }
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            c+=check(grid[i]);
        }
       return c; 
    }
}