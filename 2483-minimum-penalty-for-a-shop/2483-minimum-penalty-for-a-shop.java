class Solution {
    public int bestClosingTime(String s) {
        int[] pref=new int[s.length()];
        int[] suf=new int[s.length()];
        int c1=0;
        int c2=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='Y')
            {
                c1+=1;
            }
             if(s.charAt(i)=='N')
            {
                c2+=1;
            }
            pref[i]=c1;
            suf[i]=c2;
        }
        int mine=Integer.MAX_VALUE;
        int z1=-1;
        if(pref[s.length()-1]<mine)
        {
            mine=pref[s.length()-1];
            z1=0;
        }
        System.out.println(mine);
        if(suf[s.length()-1]<mine)
        {
            mine=suf[s.length()-1];
            z1=s.length();
        }
        System.out.println(mine);
        for(int i=0;i<s.length();i++)
        {
            int m=(c1-pref[i])+suf[i];
            if(m<mine)
            {
                mine=m;
                z1=i+1;
            }
            else if(m==mine)
            {
                z1=Math.min(z1,i+1);
            }

        }
        return z1;
    }
}