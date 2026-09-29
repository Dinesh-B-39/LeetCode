class Solution {
    public boolean check(char[][] grid,int i,int j,int c1, HashMap<String,Boolean> map)
    {
        String s=i+" "+j+" "+c1;
        if(i==grid.length-1 && j==grid[0].length-1)
        {
            if(grid[i][j]==')')
            {
                if(c1==0)
                {
                    return false;
                }
                else
                {
                    c1-=1;
                }
                return c1==0;
            }
            else
            {
                return false;
            }
            
        }
        if(map.containsKey(s))
        {
            return map.get(s);
        }
        boolean s1=false;
        boolean s2=false;
      
        if(grid[i][j]=='(')
        {
           c1+=1;;
        }
        else 
        {
            if(c1==0)
            {
                return false;
            }
            else
            {
                c1-=1;
            }
        }
        int z1=c1;
        if(j+1<grid[0].length)
        {
            s1=check(grid,i,j+1,c1,map);
        }
        if(i+1<grid.length)
        {
            s2=check(grid,i+1,j,z1,map);
        }
        boolean x=s1 || s2;
        map.put(s,x);
        return x;
    }
    public boolean hasValidPath(char[][] grid) {
        if(grid[0][0]==')')
        {
            return false;
        }
        HashMap<String,Boolean> map=new HashMap<>();
        
        return check(grid,0,0,0,map);
        
    }
}