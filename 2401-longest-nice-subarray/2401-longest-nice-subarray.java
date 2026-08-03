class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int c=1;
            int be=nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                if((be&nums[j])==0)
                {
                    be=be|nums[j];
                    c+=1;
                }
                else
                {
                    
                    break;
                    
                }
            }
            maxe=Integer.max(maxe,c);
        }
        return maxe;
    }
}