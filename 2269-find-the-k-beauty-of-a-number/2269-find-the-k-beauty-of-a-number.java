class Solution {
    public int divisorSubstrings(int num, int k) {
        String s=num+"";
        int i=0;
        int j=k-1;
        int c=0;
        while(j<s.length())
        {
            int n=Integer.parseInt(s.substring(i,j+1));
            if(n!=0)
            {
                if(num%n==0)
                {
                    c+=1;
                }
            }
            i+=1;
            j+=1;
        }
       return c; 
    }
}