class Solution {
    public int totalWaviness(int num1, int num2) {
        int c=0;
        for(int i=num1;i<=num2;i++)
        {
            String s=i+"";
            for(int j=1;j<s.length()-1;j++)
            {
                int mid=s.charAt(j)-'0';
                int lft=s.charAt(j-1)-'0';
                int ryt=s.charAt(j+1)-'0';
                if((mid<lft && mid<ryt)||(mid>lft && mid>ryt))
                {
                    c+=1;
                }

            }
        }
        return c;
    }
}