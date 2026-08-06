class Solution {
    public int smallestNumber(int n, int t) {
        int c=1;
        while(true)
        {
            int k=n;
            c=1;
            while(k!=0)
            {
                c*=k%10;
                k=k/10;
            }
            if(c%t==0)
            {
                break;
            }
            n+=1;

        }
        return n;
    }
}