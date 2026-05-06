class Solution {
    public void check(char[] arr)
    {
        for(int i=0;i<arr.length/2;i++)
        {
            char temp=arr[i];
           arr[i]=arr[arr.length-i-1];
           arr[arr.length-i-1]=temp;
        }
    }
    public char[][] rotateTheBox(char[][] boxGrid) {
        char[][] res=new char[boxGrid[0].length][boxGrid.length];
        for(int i=0;i<boxGrid.length;i++)
        {
            for(int j=0;j<boxGrid[0].length;j++)
            {
                res[j][i]=boxGrid[i][j];
            }
        }
        for(int i=0;i<res.length;i++)
        {
            check(res[i]);
        }
        for(int i=res.length-2;i>=0;i--)
        {
            for(int j=0;j<res[0].length;j++)
            {
                int s1=i;
                int s2=j;
                while(s1<res.length-1 && res[s1][s2]=='#' && res[s1+1][s2]=='.')
                {
                    res[s1][s2]='.';
                    res[s1+1][s2]='#';
                    s1+=1;
                }
            }
        }
        return res;
    }
}