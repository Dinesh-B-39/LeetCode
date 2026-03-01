class Solution {
    public int minPartitions(String n) {
        String s="9876543210";
        for(int i=0;i<s.length();i++)
        {
            if(n.indexOf(s.charAt(i))!=-1)
            {
                return Integer.parseInt(s.charAt(i)+"");
            }
        }
        return 0;
    }
}