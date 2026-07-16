class Solution {
    public int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int[] pref=new int[nums.length];
        pref[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pref[i]=Math.max(pref[i-1],nums[i]);
        }
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            res[i]=gcd(nums[i],pref[i]);
            System.out.print(res[i]+" ");
        }
        Arrays.sort(res);
        long sum=0;
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            sum+=(gcd(res[l],res[r]));
            l+=1;
            r-=1;
        }
        return sum;
        
    }
}