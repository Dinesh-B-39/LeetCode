class Solution {
    public int numberOfSubstrings(String s) {
        int[] cha=new int[3];
        int c=0;
        Arrays.fill(cha,-1);
        int j=0;
        while(j<s.length())
        {
            cha[s.charAt(j)-'a']=j;
            int mine=Integer.MAX_VALUE;;
            for(int i=0;i<cha.length;i++)
            {
                mine=Integer.min(mine,cha[i]);
            }
            if(mine!=-1)
            {
                c+=mine-0+1;
            }
            j+=1;
        }
        return c;
    }
}