class Solution {
    public int minAllOneMultiple(int k) {
        if(k%2==0 || k%5==0)
        {
            return -1;
        }
        int c=0;
        int m=0;
        while(true)
        {
           m=((m*10)+1)%k;
           c+=1;
           if(m%k==0)
           {
            return c;
           }
        }
    }
}