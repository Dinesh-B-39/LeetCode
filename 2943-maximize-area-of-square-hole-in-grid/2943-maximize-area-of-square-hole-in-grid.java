class Solution {
   public int check(int[] nums) {
    int i=0;
    int j=1;
    int maxe=-1;
    while(j<nums.length)
    {
        if(nums[j]==nums[j-1]+1)
        {
            int u=(nums[j]+1)-(nums[i]-1);
            maxe=Math.max(maxe,u);
        }
        else
        {
            i=j;
        }
        j+=1;
    }
   return maxe;
}

    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        if(hBars.length==1 || vBars.length==1)
        {
            return 4;
        }
        Arrays.sort(hBars);
        int z1=check(hBars);
         Arrays.sort(vBars);
        int z2=check(vBars);
     
        if(z1==-1 || z2==-1)
        {
            return 4;
        }
        int m1=Math.min(z1,z2);
        return m1*m1;
    }
}