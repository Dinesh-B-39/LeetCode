class Solution {
    public int countPrimes(int n) {
        int[] temp=new int[n];
        Arrays.fill(temp,1);
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(temp[i]!=0)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    temp[j]=0;
                }
            }
        }
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(temp[i]==1)
            {
                 c+=1;
            }
           
        }
        return c;
        
    }
}