class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb1=new StringBuilder();
         StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==y)
            {
                sb1.append(y+"");
            }
            else 
            {
                sb2.append(s.charAt(i)+"");
            }

        }
       return sb1.toString()+sb2.toString();
    }
}