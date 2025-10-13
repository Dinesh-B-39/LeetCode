class Solution {
    public void check(String s,ArrayList<String> list)
    {
        if(list.size()>0 && s.length()==(list.get(list.size()-1)).length())
        {
            char[] s1=s.toCharArray();
            char[] s2=list.get(list.size()-1).toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            for(int i=0;i<s1.length;i++)
            {
                if(s1[i]!=s2[i])
                {
                    list.add(s);
                    return;
                }
            }
    
        }
        else
        {
            list.add(s);
        }
    }
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> list=new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++)
        {
            check(words[i],list);
        }
        return list;
        
    }
}