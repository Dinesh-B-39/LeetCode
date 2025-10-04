class Solution {
    public String majorityFrequencyGroup(String s) {
        int[] freq=new int[26];
        int[] snt=new int[101];
        int[] set2=new int[26];
        int y=0;
        int z=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(set2[s.charAt(i)-'a']==0)
            {
                 snt[freq[s.charAt(i)-'a']]++;
                if(snt[freq[s.charAt(i)-'a']]>z)
                {
                     z=snt[freq[s.charAt(i)-'a']];
                     y=freq[s.charAt(i)-'a'];
                }
                else if(snt[freq[s.charAt(i)-'a']]==z)
                {
                    y=Math.max(y,freq[s.charAt(i)-'a']);

                }

                set2[s.charAt(i)-'a']=1;


            }
           
        }
        StringBuilder sb=new StringBuilder();
        int[] set=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(set[s.charAt(i)-'a']==0 && freq[s.charAt(i)-'a']==y)
            {
                sb.append(s.charAt(i));
                set[s.charAt(i)-'a']=1;
            }
        }
        
      return sb.toString();
    }
}