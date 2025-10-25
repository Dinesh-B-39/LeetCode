class Solution {
    public int totalMoney(int n) {
        int k=n/7;
        int m=0;
        int x=28;
        int z=1;
        for(int i=0;i<k;i++)
        {
            m+=x;
            x+=7;
            z+=1;
        }
       
        
        if(k==0)
        {
            int v=1;
            for(int i=0;i<n;i++)
            {
                m+=v;
                v+=1;
            }
            return m;
        }
        int y=7-((((k*7)+7)-n));
         
        
        for(int i=0;i<y;i++)
        {
            m+=z;
            z+=1;
        }
       

        return m;
        
    }
}