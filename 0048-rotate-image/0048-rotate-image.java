class Solution {
    public void check(int[] temp)
    {
        for(int i=0;i<temp.length/2;i++)
        {
            int m=temp[i];
            temp[i]=temp[temp.length-i-1];
            temp[temp.length-i-1]=m;
        }
    }
    public void rotate(int[][] matrix) {
        int[][] temp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(temp[i][j]!=-1)
                {
                    int m=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=m;
                    temp[j][i]=-1;
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            check(matrix[i]);
        }
        
    }
}