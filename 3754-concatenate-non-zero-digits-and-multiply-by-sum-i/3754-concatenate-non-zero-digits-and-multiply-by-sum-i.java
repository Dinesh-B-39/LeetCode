class Solution {
    public long sumAndMultiply(int n) {
        long c=0;
        long m=0;
        StringBuilder sb=new StringBuilder(n+"");
        for(int i=0;i<sb.length();i++)
        {
            
            if(sb.charAt(i)!='0')
            {
                int z=sb.charAt(i)-'0';
                c=(c*10)+z;
                m+=z;
            }
            
        }
        return c*m;
    }
}