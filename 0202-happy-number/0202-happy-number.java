class Solution {
    public int check(int n)
    {
        int z=0;
        while(n>0)
        {
            int k=n%10;
            z+=k*k;
            n=n/10;
        }
        return z;
    }
    public boolean isHappy(int n) {
        int v=n;
        while(v>=10)
        {
            v=check(v);
        }
        return v==1 || v==7;
        
    }
}