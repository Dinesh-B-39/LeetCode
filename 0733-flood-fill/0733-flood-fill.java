class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] visited=new int[image.length][image[0].length];
        Queue<int[]> qu=new LinkedList<>();
        int[] a1=new int[2];
        a1[0]=sr;
        a1[1]=sc;
        qu.offer(a1);
        int k=image[sr][sc];
        while(!qu.isEmpty())
        {
            int [] temp=qu.poll();
            if(visited[temp[0]][temp[1]]!=-1)
            {
                int i=temp[0];
                int j=temp[1];
            
                visited[temp[0]][temp[1]]=-1;
                image[temp[0]][temp[1]]=color;

                if(i+1<image.length && image[i+1][j]==k)
                {
                    int [] temp1=new int[2];
                    temp1[0]=i+1;
                    temp1[1]=j;
                     qu.offer(temp1);
                }
                if(i-1>=0 && image[i-1][j]==k)
                {
                    int [] temp1=new int[2];
                    temp1[0]=i-1;
                    temp1[1]=j;
                    qu.offer(temp1);
                }
                 if(j+1<image[0].length && image[i][j+1]==k)
                {
                    int [] temp1=new int[2];
                    temp1[0]=i;
                    temp1[1]=j+1;
                    qu.offer(temp1);
                }
                if(j-1>=0 && image[i][j-1]==k)
                {
                    int [] temp1=new int[2];
                    temp1[0]=i;
                    temp1[1]=j-1;
                    qu.offer(temp1);
                }
            }

        }
       return image; 
    }
}