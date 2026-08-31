class Pair
{
    int i;
    int j;
    int cur;
    Pair(int i,int j,int cur)
    {
        this.i=i;
        this.j=j;
        this.cur=cur;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int maxe=0;
        Queue<Pair> qu=new LinkedList<>();
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                {
                    Pair p=new Pair(i,j,0);
                    qu.add(p);
                }
                if(grid[i][j]==1)
                {
                    count+=1;
                }
            }
        }
        int vis=0;
        while(!qu.isEmpty())
        {
            Pair p=qu.poll();
            if((p.i)+1<grid.length && grid[(p.i)+1][p.j]==1)
            {
                vis+=1;
                grid[(p.i)+1][p.j]=2;
                qu.offer(new Pair((p.i)+1,p.j,(p.cur)+1));
                maxe=Math.max(maxe,(p.cur)+1);
            }
            if((p.i)-1>=0 && grid[(p.i)-1][p.j]==1)
            {
                vis+=1;
                grid[(p.i)-1][p.j]=2;
                qu.offer(new Pair((p.i)-1,p.j,(p.cur)+1));
                maxe=Math.max(maxe,(p.cur)+1);
            }
             if((p.j)-1>=0 && grid[(p.i)][(p.j)-1]==1)
            {
                vis+=1;
                grid[p.i][(p.j)-1]=2;
                qu.offer(new Pair(p.i,(p.j)-1,(p.cur)+1));
                maxe=Math.max(maxe,(p.cur)+1);
            }
              if((p.j)+1<grid[0].length && grid[(p.i)][(p.j)+1]==1)
            {
                vis+=1;
                grid[p.i][(p.j)+1]=2;
                qu.offer(new Pair(p.i,(p.j)+1,(p.cur)+1));
                maxe=Math.max(maxe,(p.cur)+1);
            }
        }
        if(vis!=count)
        {
            return -1;
        }
        return maxe;
    }
}