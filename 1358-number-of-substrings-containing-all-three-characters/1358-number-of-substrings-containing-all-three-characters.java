class Solution {
    public int numberOfSubstrings(String s) {
        int a=-1;
        int b=-1;
        int res=0;
        int c=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                a=i;
            }
            else if(s.charAt(i)=='b')
            {
                b=i;
            }
            else if(s.charAt(i)=='c')
            {
                c=i;
            }
            if(a!=-1 && b!=-1 && c!=-1)
            {
                int m=Math.min(a,Math.min(b,c));
                res+=1;
                res+=(m-1-0+1);

            }
        }
        return res;
    }
}