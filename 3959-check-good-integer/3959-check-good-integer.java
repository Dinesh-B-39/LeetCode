class Solution {
    public boolean checkGoodInteger(int n) {
        int dsum=0;
        int ssum=0;
        while(n>0)
        {
            int p=n%10;
            dsum+=p;
            ssum+=p*p;
            n=n/10;
        }
        return ssum-dsum>=50;
    }
}