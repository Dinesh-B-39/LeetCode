class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int k1=0;
        int k2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                k1=i;
                k2=i;
                break;
            }

        }
        int z=k1;
        for(int i=z+1;i<nums.length;i++)
        {
            if(nums[i]==1 && (k2-k1)<k)
            {
                return false;
            }
            else if(nums[i]==1 && (k2-k1)>=k)
            {
                k1=i;
                k2=i;
               
            }
            else 
            {
                k2=i;
            }
        }
       
        return true;
    }
}