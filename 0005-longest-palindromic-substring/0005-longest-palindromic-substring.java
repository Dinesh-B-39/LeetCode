class Solution {
    public String check(String s,int i,int j)
    {
        while(i>=0 && i<s.length() && j>=0 && j<s.length())
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i-=1;
                j+=1;
            }
            else
            {
                break;
            }
        }
        if(i==-1)
        {
            return s.substring(i+1,j);
        }
    //     else if(j==s.length())
    //    {
    //         return s.substring(i,j);
    //     }
        // else
        // {

        // }
        return s.substring(i+1,j);

    }
    public String longestPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            String p1=check(s,i,i);
            if(p1.length()>res.length())
            {
                res=p1;
            }
            String p2=check(s,i,i+1);
             if(p2.length()>res.length())
            {
                res=p2;
            }
        }
        return res;
        
    }
}