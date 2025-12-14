class Solution {
    public void chan(int[] matrix)
    {
        for(int i=0;i<matrix.length/2;i++)
        {
            int temp=matrix[i];
            matrix[i]=matrix[matrix.length-1-i];
            matrix[matrix.length-i-1]=temp;
        }
    }
    public void rotate(int[][] matrix) {
        int[][] check=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(check[i][j]!=-1)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                    check[i][j]=-1;
                    check[j][i]=-1;
                }

            }
        }
        for(int i=0;i<matrix.length;i++)
        {
           
           chan(matrix[i]);
        }

        
    }
}