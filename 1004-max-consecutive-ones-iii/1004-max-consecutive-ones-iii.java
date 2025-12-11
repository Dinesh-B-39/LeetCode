class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int c=0;
        int maxe=Integer.MIN_VALUE;
        while(j<nums.length)
        {
            if(nums[j]==0)
            {
                c+=1;
            }
            while(c>k)
            {
                if(nums[i]==0)
                {
                    c-=1;
                }
                i+=1;
            }
            maxe=Math.max(maxe,j-i+1);
            j+=1;
        }
        return maxe;
    }
}