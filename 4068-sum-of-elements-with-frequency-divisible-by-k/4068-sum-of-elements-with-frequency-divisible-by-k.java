class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int[] res=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            res[nums[i]]++;
        }
        int c=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]) && res[nums[i]]%k==0)
            {
                c+=nums[i]*res[nums[i]];
                
            }
            set.add(nums[i]);
        }
        return c;
    }
}