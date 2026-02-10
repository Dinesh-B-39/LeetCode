class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=matrix.length;
        int left=0;
        int right=matrix[0].length;
        boolean[][] temp=new boolean[matrix.length][matrix[0].length];
        while(left<right && top<bottom)
        {
            for(int i=left;i<right;i++)
            {
                if(temp[top][i]!=true)
                {
                     System.out.println(matrix[top][i]);
                    list.add(matrix[top][i]);
                    temp[top][i]=true;
                }
               
            }
            top+=1;
           
            for(int i=top;i<bottom;i++)
            {
                  if(temp[i][right-1]!=true)
                {
                 System.out.println(matrix[i][right-1]);
                list.add(matrix[i][right-1]);
                 temp[i][right-1]=true;
                }
            }
            right-=1;
           
                 for(int i=right-1;i>=left;i--)
            {
                 if(temp[bottom-1][i]!=true)
                {
                System.out.println(matrix[bottom-1][i]);
                list.add(matrix[bottom-1][i]);
                temp[bottom-1][i]=true;
                }
            }
            
            bottom-=1;
           
            for(int i=bottom-1;i>=top;i--)
            {
                
                  if(temp[i][left]!=true)
                {
                System.out.println(matrix[i][left]);
                list.add(matrix[i][left]);
                temp[i][left]=true;
                }
            }
           
            left+=1;
            
        }
        return list;
    }
}