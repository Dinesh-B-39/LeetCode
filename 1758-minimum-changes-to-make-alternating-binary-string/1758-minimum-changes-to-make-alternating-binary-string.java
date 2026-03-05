class Solution {
    public int check(String s,char c,int ind)
    {
        if(ind==s.length())
        {
            return 0;
        }
        // if(ind==0)
        // {
        //     int non_take=check(s,s.charAt(ind),ind+1);
        //     char p=s.charAt(ind)=='0'?'1':'0';
        //     int take=1+check(s,p,ind+1);
        //     return Math.min(non_take,take);
        // }
       
            if(c!=s.charAt(ind))
            {
                return check(s,s.charAt(ind),ind+1);
            }
            else
            {
                char p=c=='0'?'1':'0';
                return 1+check(s,p,ind+1);
            }
        
    }
    public int minOperations(String s) {
        int p1=check(s,'0',0);
        int p2=check(s,'1',0);
        return Math.min(p1,p2);
        
    }
}