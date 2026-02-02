class Solution {
    public boolean check(int ind,int[] arr,Boolean[] dp)
    {
         if(ind<0 ||ind>=arr.length)
        {
            return false;
        }
        if(arr[ind]==0)
        {
            return true;
        }
        if(dp[ind]!=null)
        {
            return dp[ind];
        }
        dp[ind]=false;
        boolean take=check(ind+arr[ind],arr,dp);
        boolean non_take=check(ind-arr[ind],arr,dp);
        dp[ind]=take || non_take;
        return dp[ind];
    }
    public boolean canReach(int[] arr, int start) {
        Boolean[] dp=new Boolean[arr.length];
        return check(start,arr,dp);
        
    }
}