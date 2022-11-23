public class MaxAreaOfIsland {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
        int[][] grid = {{1,1,1,1,0}, {1,1,0,1,0}, {1,1,0,0,0}, {0,0,0,0,1}};
        int res = s.maxAreaOfIsland(grid);
        System.out.println(res);
    }
}
class Solution3 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }
        if (grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 0;
        int count = 1;
        count += dfs(grid, i-1, j);
        count += dfs(grid, i+1, j);
        count += dfs(grid, i, j-1);
        count += dfs(grid, i, j+1);
        return count;
    }
}
