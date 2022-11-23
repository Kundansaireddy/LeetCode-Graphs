public class NumberOfIslands {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        char[][] grid ={{'1','1','1','1','0'}, {'1','1','0','1','0'}, {'1','1','0','0','0'}, {'0','0','0','0','1'}};
        int res = s.numIslands(grid);
        System.out.println(res);
    }
}
class Solution2{
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    makeallzero(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    void makeallzero(char [][] grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0') return;
        grid[i][j] ='0';
        makeallzero(grid,i+1,j);
        makeallzero(grid,i-1,j);
        makeallzero(grid,i,j+1);
        makeallzero(grid,i,j-1);
    }
}
