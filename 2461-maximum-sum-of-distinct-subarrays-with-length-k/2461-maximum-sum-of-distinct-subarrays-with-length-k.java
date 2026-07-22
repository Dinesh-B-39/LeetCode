class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0;
        int j=0;
        HashSet<Integer> set=new HashSet<>();
        long sum=0;
        long maxe=0;
        while(j<nums.length)
        {
            while(j<nums.length && j-i+1<=k && !set.contains(nums[j]))
            {
                set.add(nums[j]);
                sum+=nums[j];
                j+=1;
            }
            if(j-i==k)
            {
                maxe=Math.max(maxe,sum);
                set.remove(nums[i]);
                sum-=nums[i];
                i+=1;
                
            }
            else
            {
                while(i<nums.length && j<nums.length && nums[i]!=nums[j])
                {
                    sum-=nums[i];
                    set.remove(nums[i]);
                    i+=1;
                   
                }
                if(i<nums.length)
                {
                    set.remove(nums[i]);
                sum-=nums[i];
                i+=1;
                }
                


            }
        }
        return maxe;
    }
}