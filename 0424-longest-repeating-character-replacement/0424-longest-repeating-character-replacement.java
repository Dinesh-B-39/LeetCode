class Solution {
    public int check(int[] cha)
    {
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<cha.length;i++)
        {
            maxe=Math.max(maxe,cha[i]);
        }
        return maxe;
    }
    public int characterReplacement(String s, int k) {
        int i=0;
        int j=0;
        int maxlen=Integer.MIN_VALUE;
        int maxfreq=Integer.MIN_VALUE;
        int[] cha=new int[26];
        while(j<s.length())
        {
            cha[s.charAt(j)-'A']+=1;
            maxfreq=Math.max(maxfreq,cha[s.charAt(j)-'A']);
            if((j-i+1)-maxfreq>k)
            {
                cha[s.charAt(i)-'A']-=1;
                i+=1;
                maxfreq=check(cha);
            }
            maxlen=Math.max(maxlen,j-i+1);
            j+=1;
        }
        return maxlen;
    }
}