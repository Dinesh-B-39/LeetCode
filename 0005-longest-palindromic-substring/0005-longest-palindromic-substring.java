class Solution {
    public boolean check(int start,int end,String s)
    {
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start+=1;
            end-=1;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String s1="";
        int maxe=0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(check(i,j,s))
                {
                    int n=j-i+1;
                    if(n>maxe)
                    {
                        maxe=n;
                        s1=s.substring(i,j+1);
                    }
                }
            }
        }
        return s1;
    }
}