class Solution {
    public int balancedStringSplit(String s) {
        int s1=0;
        int s2=0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
            {
                s1+=1;
            }
            if(s.charAt(i)=='R')
            {
                s2+=1;
            }
            if(s1==s2)
            {
                c+=1;
                s1=0;
                s2=0;
            }
            
        }        
        return c;
    }
}