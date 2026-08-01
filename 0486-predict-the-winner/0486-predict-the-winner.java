class Solution {
    boolean flag=false;
    public boolean check(int[] nums,int s1,int s2,int i,int j,int turn)
    {
        if(i>j)
        {
            if(s1>=s2)
            {
                return true;
            }
            return false;
        }
        if(turn==1)
        {
            boolean s11=check(nums,s1+nums[i],s2,i+1,j,2);
            boolean s21=check(nums,s1+nums[j],s2,i,j-1,2);
            return s11 || s21;
        }
        else
        {
            boolean s11=check(nums,s1,s2+nums[i],i+1,j,1);
            boolean s21=check(nums,s1,s2+nums[j],i,j-1,1);
            boolean res=s11 && s21;
            return res;


        }
    }
    public boolean predictTheWinner(int[] nums) {
        Boolean res=check(nums,0,0,0,nums.length-1,1);
        return res;
        
    }
}