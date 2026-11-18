class Solution {
    public int countConsistent(int[] nums) {
        int res=0;
        
        for(int i=0;i<nums.length;i++)
        {
            int mine=101;
            int x=nums[i];
            mine=Math.min(mine,nums[i]);
            if(mine==nums[i])
            {
                res+=1;
            }
            for(int j=i+1;j<nums.length;j++)
            {
                mine=Math.min(mine,nums[j]);
                x=x&nums[j];
                if(x==mine)
                {
                    res+=1;
                }
            }
        }
        return res;
    }
}