class Solution {
    public String reversePrefix(String s, int k) {
        if(k<=1)
        {
            return s;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++)
        {
            sb.append(s.charAt(i));
        }
        return sb.reverse().toString()+s.substring(k);
    }
}