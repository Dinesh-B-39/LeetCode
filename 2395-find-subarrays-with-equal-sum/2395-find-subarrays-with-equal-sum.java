class Solution {
    public boolean findSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++)
        {
            int n=nums[i]+nums[i+1];
            if(set.contains(n))
            {
                return true;
            }
            set.add(n);
        }
        return false;
    }
}