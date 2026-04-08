class Solution {
    public List<String> stringSequence(String target) {
        List<String> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<target.length();i++)
        {
            temp.append(target.charAt(i));
            sb.append('a');
            list.add(sb.toString());
           
            while(temp.charAt(temp.length()-1)!=sb.charAt(sb.length()-1))
            {
                
                char c=sb.charAt(sb.length()-1);
                c=(char)((((c-'a')+1)%26)+97);
                sb.deleteCharAt(sb.length()-1);
                sb.append(c);
                list.add(sb.toString());
                
            }
        }
        return list;
    }
}