class Solution {
    int c=0;
    public void swap(int i1,int j1,int[] temp)
    {
        // System.out.println(i1+" "+j1);
        // System.out.println(j1);
        for(int i=j1;i>i1;i--)
        {
            int temp1=temp[i];
            int z=temp[i-1];
            temp[i]=z;
            temp[i-1]=temp1;
            c+=1;
        }
        // for(int i=0;i<temp.length;i++)
        // {
        //     System.out.print(temp[i]+" ");
        // }
        // System.out.println();
    }
    public int minSwaps(int[][] grid) {
        int[] temp=new int[grid.length];
        int k=0;
        for(int i=0;i<grid.length;i++)
        {
            int c=0;
            int f1=1;
            for(int j=grid[0].length-1;j>=0;j--)
            {
                if(grid[i][j]==0)
                {
                    c+=1;
                }
                else
                {
                    f1=0;
                    temp[k]=c;
                    k+=1;
                    break;
                }
            }
            if(f1==1)
            {
                  temp[k]=c;
                  k+=1;
            }
        }
        // for(int i=0;i<temp.length;i++)
        // {
        //     System.out.println(temp[i]);
        // }
        int n=grid[0].length;
        for(int i=0;i<grid.length;i++)
        {
            int z=n-i-1;
            int flag=0;
           for(int j=i;j<temp.length;j++)
           {
            if(temp[j]>=z)
            {
                //  System.out.println(i);
                // System.out.println(j);
                swap(i,j,temp);
                flag=1;
                break;
            }
           }
           if(flag==0)
           {
            return -1;
           }
        }
        return c;
    }
}