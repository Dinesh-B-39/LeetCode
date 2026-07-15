class Solution {
    public int HCF(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;


        }
        return a;
    }
    public int gcdOfOddEvenSums(int n) {
        int s1=0;
        int s2=0;
        int c1=1;
        int c2=2;
        for(int i=0;i<n;i++)
        {
            s1+=c1;
            c1+=2;
            s2+=c2;
            c2+=2;
        }
        int hcf=HCF(s1,s2);
        return hcf;
        
    }
}