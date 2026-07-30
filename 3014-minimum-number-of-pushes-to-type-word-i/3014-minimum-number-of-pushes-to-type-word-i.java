class Solution {
    public int minimumPushes(String word) {
        int c=0;
        int p=1;
        int n=word.length();
        while(n>0)
        {
           int k=Math.min(n,8);
           c+=(k*p);
           p+=1;
           n=n-8;
        }
        return c;
    }
}