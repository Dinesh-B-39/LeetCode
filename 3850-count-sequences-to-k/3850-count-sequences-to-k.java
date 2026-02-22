class Solution {
    HashMap<String,Long> map=new HashMap<>();
    public long check(int ind,int[] nums,long k,long num,long den)
    {
        if(ind==nums.length)
        {
            if(num==(k*den))
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        
        String s=ind+" "+num+" "+den;
        if(map.containsKey(s))
        {
            return map.get(s);
        }
        long s1=check(ind+1,nums,k,num*nums[ind],den);
        long s2=check(ind+1,nums,k,num,den*nums[ind]);
        long s3=check(ind+1,nums,k,num,den);
        map.put(s,s1+s2+s3);
        return s1+s2+s3;
    }
    public int countSequences(int[] nums, long k) {
        long num=1;
        long den=1;
        long m=check(0,nums,k,num,den);
        return (int)m;
    }
}