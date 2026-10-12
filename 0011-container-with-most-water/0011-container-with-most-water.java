class Solution {
    public int maxArea(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int maxe=0;
        while(i<j)
        {
            int min=Math.min(nums[i],nums[j]);
            maxe=Math.max(maxe,(j-i)*min);
            if(nums[i]<=nums[j])
            {
                i+=1;
            }
            else
            {
                j-=1;
            }
        }
       return maxe; 
    }
}