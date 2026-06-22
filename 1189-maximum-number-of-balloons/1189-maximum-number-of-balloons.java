class Solution {
    public int maxNumberOfBalloons(String s) {
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;
        int l1=0;
        int o1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='l')
            {
                l1+=1;
                if(l1==2)
                {
                    l+=1;
                    l1=0;
                }
            }
            else if(s.charAt(i)=='o')
            {
                o1+=1;
                if(o1==2)
                {
                    o+=1;
                    o1=0;
                }
            }
            else if(s.charAt(i)=='b')
            {
                b+=1;
            }
             else if(s.charAt(i)=='a')
            {
                a+=1;
            }
             else if(s.charAt(i)=='n')
            {
                n+=1;
            }
        }
        int m=Math.min(b,a);
        m=Math.min(m,l);
        m=Math.min(m,o);
        m=Math.min(m,n);
        return m;
        
    }
}