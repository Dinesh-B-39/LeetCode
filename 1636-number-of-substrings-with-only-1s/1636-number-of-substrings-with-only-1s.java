class Solution {
    public int numSub(String s) {
        long tot=0;
        long c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                c+=1;
            }
            else
            {
                tot+=((c+1)*c)/2;
                c=0;
            }
        }
         tot+=(c+1)*c/2;
         return (int)(tot%1000000007);
    }
}