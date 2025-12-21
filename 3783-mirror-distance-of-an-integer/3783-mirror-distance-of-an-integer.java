class Solution {
    public int check(int n)
    {
        int z=0;
        while(n>0)
        {
            z=(z*10)+(n%10);
            n=n/10;
        }
        return z;
    }
    public int mirrorDistance(int n) {
        return Math.abs(check(n)-n);
        
    }
}