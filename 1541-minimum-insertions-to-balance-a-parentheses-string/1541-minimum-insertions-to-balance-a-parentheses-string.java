class Solution {
    public int minInsertions(String s) {
        int c=0;
        int res=0;
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)=='(')
            {
                c+=1;
                i+=1;
            }
            else
            {
                if(c==0)
                {
                    c+=1;
                    res+=1;
                }
                if(i+1<s.length() && s.charAt(i+1)==')')
                {
                    c-=1;
                    i+=2;
                }
                else
                {
                    res+=1;
                    c-=1;
                    i+=1;
                }
            }
        }
        res+=c*2;
        return res;
    }
}