class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int res=-1;
        int k=nums.length/2;
        while(j<nums.length)
        {
            if(j>0 && nums[j]!=nums[j-1])
            {
                int z=j-i;
                if(z>k)
                {
                    return nums[i];
                }
                i=j;
                j+=1;
            }
            else
            {
                j+=1;
            }
        }
        return nums[nums.length-1];
        
    }
}