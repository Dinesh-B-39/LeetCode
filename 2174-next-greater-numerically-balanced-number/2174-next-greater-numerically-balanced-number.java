class Solution {
    public boolean check(int p)
    {
        String s=p+"";
        int[] res=new int[10];
        for(int i=0;i<s.length();i++)
        {
           res[s.charAt(i)-'0']++;
        }
        for(int i=0;i<s.length();i++)
        {
        
            if(res[s.charAt(i)-'0']!=s.charAt(i)-'0')
            {
                return false;
            }
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        int p=n+1;
        boolean flag=true;
        while(true)
        {
            if(check(p))
            {
                return p;
            }
            p+=1;
        }
        
    }
}