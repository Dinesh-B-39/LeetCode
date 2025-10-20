class Solution {
    public int longestBalanced(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        {
            int[] res=new int[100001];
            int odd=0;
            int even=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]%2==0 &&  res[nums[j]]==0)
                {
                    even+=1;
                    res[nums[j]]++;
                }
                else if(nums[j]%2==1 &&  res[nums[j]]==0)
                {
                     odd+=1;
                    res[nums[j]]++;

                }
                if(odd==even)
                {
                    s=Math.max(s,(j-i)+1);
                }
               

            }
        }
        return s;
    }
}