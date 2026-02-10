class Solution {
    public int longestBalanced(int[] nums) {
        int maxe=0;
        for(int i=0;i<nums.length;i++)
        {
            HashSet<Integer> odd=new HashSet<>();
            HashSet<Integer> even=new HashSet<>();
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]%2==0)
                {
                    even.add(nums[j]);
                }
                else if(nums[j]%2==1)
                {
                    odd.add(nums[j]);
                }
                if(odd.size()==even.size())
                {
                    maxe=Math.max(maxe,j-i+1);
                }
            }

        }
        return maxe;
    }
}