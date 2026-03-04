class Solution {
    public int numSpecial(int[][] mat) {
        int [][] temp1=new int[mat.length][mat[0].length];
        int [][] temp2=new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++)
        {
            int c1=0;
            
            for(int j=0;j<mat[0].length;j++)
            {
                c1+=mat[i][j];
            }
            // System.out.println(c1);
            for(int j=0;j<mat[0].length;j++)
            {
                temp1[i][j]=c1-mat[i][j];
                
            }
        }
        for(int i=0;i<mat[0].length;i++)
        {
            int c2=0;
            for(int j=0;j<mat.length;j++)
            {
                c2+=mat[j][i];
            }
            // System.out.println(c2);
            for(int j=0;j<mat.length;j++)
            {
                temp2[j][i]=c2-mat[j][i];
            }
        }
        // for(int i=0;i<temp1.length;i++)
        // {
        //     for(int j=0;j<temp1[0].length;j++)
        //     {
        //         System.out.print(temp1[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        //  for(int i=0;i<temp1.length;i++)
        // {
        //     for(int j=0;j<temp1[0].length;j++)
        //     {
        //         System.out.print(temp2[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int c=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1 && temp1[i][j]==0 && temp2[i][j]==0)
                {
                    c+=1;
                }
            }
        }
        return c;
    }
}