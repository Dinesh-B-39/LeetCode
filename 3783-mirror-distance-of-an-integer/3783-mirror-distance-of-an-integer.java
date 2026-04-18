class Solution {
    public int check(int num)
    {
        int z=0;
        while(num>0)
        {
            int x=num%10;
            z=(z*10)+x;
            num=num/10;
        }
        return z;
    }
    public int mirrorDistance(int n) {
        int v=check(n);
        return Math.abs(v-n);
        
    }
}