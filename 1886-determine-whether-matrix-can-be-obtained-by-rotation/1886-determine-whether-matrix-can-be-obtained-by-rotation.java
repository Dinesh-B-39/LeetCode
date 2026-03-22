class Solution {
    public void check(int[][] mat,int[][] temp)
    {
         for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                mat[i][j]=temp[i][j];
            }
        }
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        if(Arrays.deepEquals(mat,target))
        {
            return true;
        }
        int[][] temp=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                temp[i][j]=mat[i][j];
            }
        }
        for(int i1=0;i1<3;i1++)
        {
            check(mat,temp);
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    temp[i][j]=mat[j][i];
                   
                }
               
            }
           
            for(int i=0;i<mat.length;i++)
            {
                 int low=0;
                int high=mat[0].length-1;
                while(low<high)
                {
                    int tem=temp[i][low];
                    temp[i][low]=temp[i][high];
                    temp[i][high]=tem;
                    low+=1;
                    high-=1;
                }
                
            }
            //   for(int i=0;i<mat.length;i++)
            // {
            //     for(int j=0;j<mat[0].length;j++)
            //     {
                    
            //         System.out.print(temp[i][j]+" ");
            //     }
            //     System.out.println();
            // }
                
            if(Arrays.deepEquals(temp,target))
            {
                return true;
            }
        }

        return false;
    }
}