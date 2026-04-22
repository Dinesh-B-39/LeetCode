class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
        {
            return false;
        }
        boolean flag=true;
        int[] temp={2,3,5};
        while(n>1)
        {
            int c=0;
            for(int i=0;i<temp.length;i++)
            {
                if(n%temp[i]==0)
                {
                    n=n/temp[i];
                }
                else
                {
                    c+=1;
                }
            }
            if(c==3)
            {
                flag=false;
                break;
            }
        }
        return flag;
    }
}