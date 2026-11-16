class Solution {
    public String check(String s,int st,int end)
    {
        int z=0;
        end=Math.min(end,s.length());
        for(int i=st;i<end;i++)
        {
            z+=s.charAt(i)-'0';
        }
        return z+"";
    }
    public String digitSum(String s, int k) {
        StringBuilder sb=new StringBuilder();
        int ind=0;
        while(s.length()>k)
        {
            while(ind<s.length())
            {
                sb.append(check(s,ind,ind+k));
                ind+=k;
            }
            s=sb.toString();
            ind=0;
            sb=new StringBuilder();
            
        }
        return s;
    }
}