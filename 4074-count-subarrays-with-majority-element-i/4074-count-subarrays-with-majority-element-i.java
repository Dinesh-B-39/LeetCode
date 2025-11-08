class Solution {
    public boolean check(int z,int size)
    {
        if(z>(size/2))
        {
            return true;
        }
        return false;
    }
    public int countMajoritySubarrays(int[] nums, int target) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
           int z=0;
            for(int j=i;j<nums.length;j++)
            {
               if(nums[j]==target)
               {
                z+=1;
               }
                if(check(z,j-i+1))
                {
                    c+=1;
                }

            }
        }
        return c;
        
    }
}