class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int maxe=Integer.MIN_VALUE;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);
        }
        int c=0;
        for(int i:set)
        {
           if(!set.contains(i-1))
           {
            int x=i;
            c=0;
            while(set.contains(x))
            {
                c+=1;
                x+=1;
            }
            maxe=Math.max(maxe,c);
           }
            
        }
        return maxe;
    }
}