class Solution {
    public int check(int ind,int[] arr,int[] dp)
    {
        if(ind==arr.length-1)
        {
            return arr[ind];
        }
        if(ind>=arr.length)
        {
            return 0;
        }
        if(dp[ind]!=-1)
        {
            return dp[ind];
        }
        int s1=Integer.MIN_VALUE;
        int s2=Integer.MIN_VALUE;
        int s3=Integer.MIN_VALUE;
        s1=arr[ind]-check(ind+1,arr,dp);
        if(ind+1<arr.length)
        {
            s2=arr[ind]+arr[ind+1]-check(ind+2,arr,dp);
        }
        if(ind+2<arr.length)
        {
            s3=arr[ind]+arr[ind+1]+arr[ind+2]-check(ind+3,arr,dp);
        }
        return dp[ind]=Math.max(s1,Math.max(s2,s3));
    }
    public String stoneGameIII(int[] arr) {
        int[] dp=new int[arr.length];
        Arrays.fill(dp,-1);
        int res=check(0,arr,dp);
        if(res>0)
        {
            return "Alice";
        }
        else if(res<0)
        {
            return "Bob";
        }
        return "Tie";
    }
}