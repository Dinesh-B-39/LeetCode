class Solution {
    public String check(String s,int i,int j)
    {
        while(i>=0 && j<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i-=1;
                j+=1;
            }
            else
            {
                return s.substring(i+1,j);
            }
        }
        if(i<0 && j==s.length())
        {
             return s.substring(i+1,j);
        }
        if(j==s.length())
        {
            return s.substring(i+1,j);
        }
        if(i<0)
        {
            return s.substring(i+1,j);
        }
        return "";
    }
    public String longestPalindrome(String s) {
        int maxe=0;
        String res="";
        for(int i=0;i<s.length();i++)
        {
            String x=check(s,i,i);
           if(x.length()>maxe)
           {
            maxe=x.length();
            res=x;
           }

            String y=check(s,i,i+1);
             if(y.length()>maxe)
           {
            maxe=y.length();
            res=y;
           }
            
        }
        return res;
    }
}