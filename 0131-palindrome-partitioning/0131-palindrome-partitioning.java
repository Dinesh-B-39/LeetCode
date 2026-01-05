class Solution {
    List<List<String>> res=new ArrayList<>();
    public boolean palindrome(StringBuilder s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i+=1;
            j-=1;
        }
        return true;
    }
    public void check(String s,List<String> list,int ind)
    {
        if(ind==s.length())
        {
            res.add(new ArrayList<String>(list));
            return;
        }
         StringBuilder sb=new StringBuilder();
        for(int i=ind;i<s.length();i++)
        {
           sb.append(s.charAt(i));
           if(palindrome(sb))
           {
            list.add(sb.toString());
            check(s,list,i+1);
            list.remove(list.size()-1);
           }
        }
    }
    public List<List<String>> partition(String s) {
        List<String> list=new ArrayList<>();
        check(s,list,0);
        return res;
    }
}