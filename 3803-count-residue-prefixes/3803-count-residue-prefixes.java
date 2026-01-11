class Solution {
    public int residuePrefixes(String s) {
       
        int[] arr=new int[26];
        int c=0;
        int v=0;
        for(int i=0;i<s.length();i++)
        {
            int n=s.charAt(i)-'a';
            {
                if(arr[n]==0)
                {
                    v+=1;
                }
                arr[n]+=1;
            }
            if(v==(i+1)%3)
            {
                c+=1;
            }
        }
        return c;
    }
}