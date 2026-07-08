class Solution {
    public long sumAndMultiply(int n) {
        long d=1;
        long c=0;
        long sum=0;
        while(n!=0)
        {
            int p=n%10;
            if(p!=0)
            {
                c=(p*d)+c;
                sum+=p;
                d=d*10;
            }
            n=n/10;
        }
        return c*sum;

        
    }
}