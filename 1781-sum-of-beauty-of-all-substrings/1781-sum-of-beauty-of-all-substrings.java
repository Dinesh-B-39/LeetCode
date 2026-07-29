class Solution {
    int res=0;
    public void check(String s)
    {
        int[] arr=new int[26];
        int maxe=Integer.MIN_VALUE;
        int mine=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']+=1;
            
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
            maxe=Math.max(maxe,arr[i]);
            mine=Math.min(mine,arr[i]);
            }

        }
      
        res=res+(maxe-mine);
    }
    public int beautySum(String s) {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+3;j<s.length()+1;j++)
            {
                
                check(s.substring(i,j));

            }
        }
        
        return res;
    }
}