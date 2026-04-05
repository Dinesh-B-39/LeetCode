class Solution {
    public boolean judgeCircle(String s) {
        int up=0;
        int down=0;
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='U')
            {
                up+=1;
            }
            else if(s.charAt(i)=='D')
            {
                down+=1;
            }
            else if(s.charAt(i)=='L')
            {
                left+=1;
            }
            else
            {
                right+=1;
            }

        }
        return up==down && left==right;
    }
}