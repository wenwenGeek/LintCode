/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa64 {

    public int minPathSum(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            for (int cell = 0; cell < grid[0].length; cell++) {
                if (row == 0 && cell == 0) {
                    continue;
                }

                if (row == 0) {
                    grid[row][cell] += grid[0][cell - 1];
                } else if (cell == 0) {
                    grid[row][cell] += grid[row - 1][0];
                } else {
                    grid[row][cell] += Math.min(grid[row - 1][cell], grid[row][cell - 1]);
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }

}
