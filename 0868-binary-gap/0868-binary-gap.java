class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int maxe=-1;
        int j=-1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                j=i;
                break;
            }
        }
        if(j==-1)
        {
            return 0;
        }
        for(int i=j+1;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                maxe=Math.max(maxe,i-j);
                j=i;
            }
        }
        if(maxe==-1)
        {
            return 0;
        }
        return maxe;
    }
}