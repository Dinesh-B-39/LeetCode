class Solution {
    public boolean hasAlternatingBits(int n) {
        String s=Integer.toBinaryString(n);
        int flag=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='1' && s.charAt(i+1)=='0' || s.charAt(i)=='0' && s.charAt(i+1)=='1')
            {
                continue;
            }
            else
            {
                flag=-1;
                break;
            }
        }
        if(flag==-1)
        {
            return false;
        }
        return true;
    }
}