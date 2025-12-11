class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
        {
            return 0;
        }
        if(s.length()==1 || s.equals("   "))
        {
            return 1;
        }
        int i=0;
        int[] buck=new int[365];
        int j=0;
        int maxe=Integer.MIN_VALUE;
        while(j<s.length())
        {
            buck[(int)s.charAt(j)]++;
            while(buck[(int)s.charAt(j)]>1)
            {
                buck[(int)s.charAt(i)]-=1;
                i+=1;
            }
            maxe=Math.max(maxe,j-i+1);
            j+=1;
        }
        return maxe;
    }
}