class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack=new Stack<>();
        int[] right=new int[heights.length];
        for(int i=heights.length-1;i>=0;i--)
        {
            if(stack.isEmpty())
            {
                right[i]=heights.length;
                int[] arr=new int[2];
                arr[0]=heights[i];
                arr[1]=i;
                stack.add(arr);
                continue;
            }
            while(!stack.isEmpty() && stack.peek()[0]>=heights[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                right[i]=right.length;
            }
            else
            {
                right[i]=stack.peek()[1];
            }
            int[] arr=new int[2];
            arr[0]=heights[i];
            arr[1]=i;
            stack.add(arr);
        }
        Stack<int[]> stack2=new Stack<>();
        int[] left=new int[heights.length];
        for(int i=0;i<heights.length;i++)
        {
            if(stack2.isEmpty())
            {
                left[i]=-1;
                int[] arr=new int[2];
                arr[0]=heights[i];
                arr[1]=i;
                stack2.add(arr);
                continue;
            }
            while(!stack2.isEmpty() && stack2.peek()[0]>=heights[i])
            {
                stack2.pop();
            }
            if(stack2.isEmpty())
            {
                 left[i]=-1;
            }
            else
            {
                left[i]=stack2.peek()[1];
            }
             int[] arr=new int[2];
             arr[0]=heights[i];
             arr[1]=i;
             stack2.add(arr);
        }
        int maxe=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++)
        {
           maxe=Math.max((right[i]-left[i]-1)*heights[i],maxe);
        }
        //  for(int i=0;i<right.length;i++)
        // {
        //     System.out.print(left[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<right.length;i++)
        // {
        //     System.out.print(right[i]+" ");
        // }
        return maxe;
    }
}