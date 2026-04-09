class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pref[i]=pref[i-1]+nums[i];
        }
        int c=0;
        for(int i=0;i<pref.length;i++)
        {
            
            if(pref[i]==k)
            {
                c+=1;
            }
            for(int j=0;j<i;j++)
            {
                if(pref[i]-pref[j]==k)
                {
                    c+=1;
                }
            }
        }
        return c;
    }
}