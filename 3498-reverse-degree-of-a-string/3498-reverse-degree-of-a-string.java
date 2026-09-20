class Solution {
    public int reverseDegree(String s) {
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            int x=26-(s.charAt(i)-'a');
            x=x*(i+1);
            res+=x;
        }
       return res; 
    }
}