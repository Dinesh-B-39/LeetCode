class Solution {
    public boolean check(int val,int ind)
    {
        int z=0;
        while(val>0)
        {
            z+=val%10;
            val=val/10;
        }
        return z==ind;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(check(nums[i],i))
            {
                return i;
            }
        }
        return -1;
    }
}