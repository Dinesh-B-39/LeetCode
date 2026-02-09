class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    l1.add(i);
                    l2.add(j);
                }
            }
        }
        for(int i=0;i<l1.size();i++)
        {
            int k=l1.get(i);
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[k][j]=0;
            }
        }
        for(int i=0;i<l2.size();i++)
        {
            int k=l2.get(i);
            for(int j=0;j<matrix.length;j++)
            {
                matrix[j][k]=0;
            }
        }
        
    }
}