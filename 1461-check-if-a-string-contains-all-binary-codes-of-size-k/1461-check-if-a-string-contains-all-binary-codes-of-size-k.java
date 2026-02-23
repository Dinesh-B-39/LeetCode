class Solution {
    List<String> list=new ArrayList<>();
    public void check(StringBuilder sb,int k)
    {
        if(sb.length()==k)
        {
            list.add(sb.toString());
            return;
        }
        sb.append("0");
        check(sb,k);
        sb.deleteCharAt(sb.length()-1);

        sb.append("1");
        check(sb,k);
        sb.deleteCharAt(sb.length()-1);
    }
    public boolean hasAllCodes(String s, int k) {
        StringBuilder sb=new StringBuilder();
        check(sb,k);
        HashSet<String> set=new HashSet<>();
        StringBuilder sb1=new StringBuilder();
        if(s.length()<k)
        {
            return false;
        }
        sb1.append(s.substring(0,k));
        set.add(sb1.toString());
        for(int i=k;i<s.length();i++)
        {
            sb1.deleteCharAt(0);
            sb1.append(s.charAt(i)+"");
            set.add(sb1.toString());
        }
        for(int i=0;i<list.size();i++)
        {
            if(!set.contains(list.get(i)))
            {
                return false;
            }
        }
    return true;
       
    }
}