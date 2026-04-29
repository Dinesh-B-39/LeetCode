class Solution {
    public int minOperations(int[][] grid, int x) {
        int[] arr=new int[grid.length*grid[0].length];
        int k=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                arr[k]=grid[i][j];
                k+=1;
            }
        }
        int ind=-1;
        Arrays.sort(arr);
       
        ind=arr.length/2;

        int target=arr[ind];
        int tot=0;
        for(int i=0;i<ind;i++)
        {
            int p=target-arr[i];
            if(p%x==0)
            {
                tot+=(p/x);
            }
            else
            {
                return -1;
            }
        }
        for(int i=ind+1;i<arr.length;i++)
        {
            int p=arr[i]-target;
            if(p%x==0)
            {
                tot+=(p/x);
            }
            else
            {
                return -1;
            }
        }
        return tot;
        
    }
}