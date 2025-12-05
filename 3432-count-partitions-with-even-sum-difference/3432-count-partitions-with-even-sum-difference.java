class Solution {
    public int countPartitions(int[] nums) {
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pref[i]=pref[i-1]+nums[i];
        }
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(Math.abs(pref[i]-(pref[nums.length-1]-pref[i]))%2==0)
            {
                c+=1;
            }
        }
        return c;
        
    }
}