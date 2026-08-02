class Solution {
    int res=0;
    public void check(int x,int y,int a,int b)
    {
        if(y>0)
        {
            double n1=(double)x/y;
            double n2=(double)a/b;
            if(n1<=n2)
            {
                res+=1;
            }

        }

    }
    public int countRatioSubarrays(int[] nums, int a, int b) {
        for(int i=0;i<nums.length;i++)
        {
            int one=0;
            int two=0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]%2==0)
                {
                    one+=1;
                }
                else
                {
                    two+=1;
                }
                check(one,two,a,b);

            }
        }
        return res;
    }
}