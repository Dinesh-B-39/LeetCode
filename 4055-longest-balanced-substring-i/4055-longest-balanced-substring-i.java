class Solution {
    public int check(int[] res,int c)
    {
       
      int n=-1;
      int ind=-1;
      for(int i=0;i<26;i++)
      {
        if(res[i]!=0)
        {
            n=res[i];
            ind=i;
            break;
        }
      }
      for(int i=ind+1;i<26;i++)
      {
        if(res[i]!=0 && res[i]!=n)
        {
            return 0;
        }
      }
        return c;
    }
    public int longestBalanced(String s) {
        int z=Integer.MIN_VALUE;
        int[] res=new int[26];
        int c=0;
        for(int i=0;i<s.length();i++)
        {
           Arrays.fill(res,0);
           c=0;
            for(int j=i;j<s.length();j++)
            {
                res[s.charAt(j)-'a']++;
                c+=1;
                z=Math.max(z,check(res,c));
            }
        }
        return z;
    }
}