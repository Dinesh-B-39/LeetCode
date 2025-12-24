class Solution {
    List<String> list=new ArrayList<>();
    public void check(String digits,HashMap<Character,String> map,StringBuilder sb,int ind)
    {
        if(sb.length()==digits.length())
        {
            list.add(sb.toString());
            return;
        }
        String s=map.get(digits.charAt((ind)));
        for(int i=0;i<s.length();i++)
        {
            sb.append(s.charAt(i)+"");
            check(digits,map,sb,ind+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
         map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        StringBuilder sb=new StringBuilder();
        check(digits,map,sb,0);
        return list;
        
    }
}