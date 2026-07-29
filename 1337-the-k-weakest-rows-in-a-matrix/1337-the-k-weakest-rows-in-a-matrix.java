class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] res=new int[mat.length][2];
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c+=1;
                }
            }
            res[i][0]=i;
            res[i][1]=c;
        }
        Arrays.sort(res,(a,b)->
        {
            if(a[1]!=b[1])
            {
                return Integer.compare(a[1],b[1]);
            }
            else
            {
                return Integer.compare(a[0],b[0]);
            }
        });
        int[] fin=new int[k];
        for(int i=0;i<k;i++)
        {
            fin[i]=res[i][0];
        }
        return fin;
    }
}