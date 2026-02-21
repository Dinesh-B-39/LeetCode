class Solution {
    public boolean check(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                c+=1;
            }
        }
        if(c==2 || c==3 || c==5 || c==7 || c==11 || c==13 || c==17 || c==19)
        {
            return true;
        }
        return false;
    }
    public int countPrimeSetBits(int left, int right) {
        int tot=0;
        for(int i=left;i<=right;i++)
        {
            if(check(Integer.toBinaryString(i)))
            {
                tot+=1;
            }
        }
        return tot;
    }
}