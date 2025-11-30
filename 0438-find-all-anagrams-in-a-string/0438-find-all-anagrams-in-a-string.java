class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(p.length()>s.length())
        {
            return list;
        }
        int[] p1=new int[26];
        int[] s1=new int[26];
        for(int i=0;i<p.length();i++)
        {
            p1[p.charAt(i)-'a']+=1;

            s1[s.charAt(i)-'a']+=1;
        }
        if(Arrays.equals(p1,s1))
        {
            list.add(0);
        }
        for(int i=p.length();i<s.length();i++)
        {
            s1[s.charAt(i-p.length())-'a']-=1;
            s1[s.charAt(i)-'a']+=1;
            if(Arrays.equals(s1,p1))
            {
                list.add(i-p.length()+1);
            }

        }
        return list;
    }
}