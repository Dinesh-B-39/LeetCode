class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb=new StringBuilder();
        int s=sum;
        int c=num;
        while(s>=9 && c>0)
            {
                sb.append("9");
                s-=9;  
                c-=1;
            }
            if(c==0 && s!=0)
            {
                return "";
            }
        if(s!=0 && s<9)
        {
            sb.append(s+"");
        }
        int y=num-sb.length();
        for(int i=0;i<y;i++)
            {
                sb.append("0");
            }
        
        return sb.toString();
    }
}