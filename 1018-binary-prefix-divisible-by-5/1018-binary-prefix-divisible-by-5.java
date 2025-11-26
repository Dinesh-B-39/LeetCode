class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        long n=0;
        List<Boolean> list=new ArrayList<>();
       
        for(int i=0;i<nums.length;i++)
        {
            n=((n*2)+nums[i])%5;
             if(n%5==0)
        {
            list.add(true);
        }
        else
        {
            list.add(false);
        }
        }
        return list;
    }
}