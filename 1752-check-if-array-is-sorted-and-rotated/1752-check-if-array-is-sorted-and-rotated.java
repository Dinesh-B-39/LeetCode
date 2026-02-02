class Solution {
    public boolean check(int[] nums) {
        int ind=-1;
        int z=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            {
                ind=i;
                z+=1;
            }
            if(z>1)
            {
                return false;
            }
        }

        if(ind==-1)
        {
            return true;
        }
        for(int i=ind;i<nums.length;i++)
        {
            if(nums[i]>nums[0])
            {
                return false;
            }
        }
        return true;
    }
}