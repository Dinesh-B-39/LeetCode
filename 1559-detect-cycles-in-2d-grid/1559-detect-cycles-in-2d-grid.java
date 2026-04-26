class Solution {
    boolean flag = false;

    public void check(char[][] grid, int i, int j, int pi, int pj, char c, int[][] temp) {

        // right
        if(j+1<grid[0].length && grid[i][j+1]==c) {
            if(temp[i][j+1]==-1 && !(i==pi && j+1==pj)) {
                flag = true;
                return;
            }
            if(temp[i][j+1]!=-1) {
                temp[i][j+1] = -1;
                check(grid, i, j+1, i, j, c, temp);
            }
        }

        // down
        if(i+1<grid.length && grid[i+1][j]==c) {
            if(temp[i+1][j]==-1 && !(i+1==pi && j==pj)) {
                flag = true;
                return;
            }
            if(temp[i+1][j]!=-1) {
                temp[i+1][j] = -1;
                check(grid, i+1, j, i, j, c, temp);
            }
        }

        // left
        if(j-1>=0 && grid[i][j-1]==c) {
            if(temp[i][j-1]==-1 && !(i==pi && j-1==pj)) {
                flag = true;
                return;
            }
            if(temp[i][j-1]!=-1) {
                temp[i][j-1] = -1;
                check(grid, i, j-1, i, j, c, temp);
            }
        }

        // up
        if(i-1>=0 && grid[i-1][j]==c) {
            if(temp[i-1][j]==-1 && !(i-1==pi && j==pj)) {
                flag = true;
                return;
            }
            if(temp[i-1][j]!=-1) {
                temp[i-1][j] = -1;
                check(grid, i-1, j, i, j, c, temp);
            }
        }
    }

    public boolean containsCycle(char[][] grid) {
        int[][] temp = new int[grid.length][grid[0].length];

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(temp[i][j] != -1) {   // ✅ important
                    flag = false;
                    temp[i][j] = -1;
                    check(grid, i, j, -1, -1, grid[i][j], temp);
                    if(flag) return true;
                }
            }
        }
        return false;
    }
}