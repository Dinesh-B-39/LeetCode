class Solution {
    public boolean check(int i1,int j1,int[] nums,int[] temp)
    {
        for(int i=i1;i<=j1;i++)
        {
            for(int j=i+1;j<=j1;j++)
            {
                if(temp[(nums[i]+nums[j])]>0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public int maxSubarray(int[] nums) {
        int[] temp=new int[1001];
        int i=0;
        int j=0;
        int maxe=0;
        while(j<nums.length)
        {
            temp[nums[j]]+=1;
            while(!check(i,j,nums,temp))
            {
                temp[nums[i]]-=1;
                i+=1;
            }
            
            maxe=Math.max(maxe,j-i+1);
            j+=1;
        }
        return maxe;
    }
}