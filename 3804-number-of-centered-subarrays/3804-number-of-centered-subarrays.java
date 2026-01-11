class Solution {
    public int centeredSubarrays(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer> set=new HashSet<>();
            int c=0;
            for(int j=i;j<nums.length;j++)
            {
                set.add(nums[j]);
                c+=nums[j];
                if(set.contains(c))
                {
                    n+=1;
                }

            }
        }
        return n;
    }
}