class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int top=0;
        int bottom=matrix.length;
        int left=0;
        int right=matrix[0].length;
        while(left<right && top<bottom)
        {
            for(int i=left;i<right;i++)
            {
                System.out.println(matrix[top][i]);
                list.add(matrix[top][i]);
            }
            top+=1;
           
            for(int i=top;i<bottom;i++)
            {
                 System.out.println(matrix[i][right-1]);
                list.add(matrix[i][right-1]);
            }
            right-=1;
            if(top<bottom)
            {
                 for(int i=right-1;i>=left;i--)
            {
                System.out.println(matrix[bottom-1][i]);
                list.add(matrix[bottom-1][i]);
            }
            }
            bottom-=1;
           if(left<right)
           {
            for(int i=bottom-1;i>=top;i--)
            {
                System.out.println(matrix[i][left]);
                list.add(matrix[i][left]);
            }
           }
            left+=1;
            
        }
        return list;
    }
}