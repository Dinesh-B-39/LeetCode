class Solution {
    Boolean flag=false;
    public void check(int i,int j,int ind,char[][] board,String word,int[][] temp)
    {
      
       
        if(ind==word.length())
        {
             temp[i][j]=-1;
            flag=true;
            return;
        }
        //up
        if(i-1>=0 && board[i-1][j]==word.charAt(ind) && temp[i-1][j]!=-1)
        {
             temp[i-1][j]=-1;
            check(i-1,j,ind+1,board,word,temp);
             temp[i-1][j]=0;
        }
        //down
        if(i+1<board.length && board[i+1][j]==word.charAt(ind) && temp[i+1][j]!=-1)
        {
            temp[i+1][j]=-1;
            check(i+1,j,ind+1,board,word,temp);
             temp[i+1][j]=0;
        }
        //left
        if(j-1>=0 && board[i][j-1]==word.charAt(ind) && temp[i][j-1]!=-1)
        {
            temp[i][j-1]=-1;
            check(i,j-1,ind+1,board,word,temp);
            temp[i][j-1]=0;
        }
        //right
        if(j+1<board[0].length && board[i][j+1]==word.charAt(ind) && temp[i][j+1]!=-1)
        {
            temp[i][j+1]=-1;
            check(i,j+1,ind+1,board,word,temp);
             temp[i][j+1]=0;
        }
        
    }
    public boolean exist(char[][] board, String word) {
        int[][]temp=new int[board.length][board[0].length];
       
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                flag=false;
                if(board[i][j]==word.charAt(0))
                {
                    temp[i][j]=-1;
                    check(i,j,1,board,word,temp);
                    temp[i][j]=0;
                    if(flag==true)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
}