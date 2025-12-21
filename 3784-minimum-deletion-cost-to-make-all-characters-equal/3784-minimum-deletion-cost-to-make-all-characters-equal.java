class Solution {
    public long minCost(String s, int[] cost) {
        long maxe=-1;
        long[] arr=new long[26];
        char ch='!';
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']+=cost[i];
            if(arr[s.charAt(i)-'a']>maxe)
            {
                maxe=arr[s.charAt(i)-'a'];
                ch=s.charAt(i);
            }
            
            
        }
        long c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<maxe || (ch-'a')!=i)
            {
                c+=arr[i];
            }
        }
        // if(c==-1)
        // {
        //     return 0;
        // }
        return c;
    }
}