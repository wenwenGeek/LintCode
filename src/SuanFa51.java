import java.util.ArrayList;
import java.util.List;

/**
 * 八皇后
 */
public class SuanFa51 {

    public static void main(String[] args) {
        //putQueens(2, 3, 8, new int[8][8]);

        System.out.println(solveNQueens(8));
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> resultList = new ArrayList<>();
        String[][] location = new String[n][n];
        int[][] map = new int[n][n];
        digui(0, n, resultList, location, map);
        return resultList;
    }

    public static void digui(int k, int n, List<List<String>> resultList, String[][] location, int[][] map) {
        if (k == n) {
            List<String> result = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder hang = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if ("Q".equals(location[i][j]))
                        hang.append("Q");
                    else
                        hang.append(".");

                }
                result.add(hang.toString());
            }
            resultList.add(result);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (map[k][i] != 1) {
                int[][] temp_map = new int[n][n];
                copy(map, temp_map);
                location[k][i] = "Q";
                map[k][i] = 1;
                putQueens(k, i, n, map);
                digui(k + 1, n, resultList, location, map);
                copy(temp_map, map);
                location[k][i] = ".";
            }
        }
    }

    public static void copy(int[][] a, int b[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                b[i][j] = a[i][j];
            }
        }
    }

    public static void putQueens(int x, int y, int n, int[][] map) {
        int[][] xy = new int[][]{{-1, 1}, {0, 1}, {1, 1}, {-1, 0}, {1, 0}, {-1, -1}, {0, -1}, {1, -1}};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 8; j++) {
                int new_x = x + i * xy[j][0];
                int new_y = y + i * xy[j][1];
                if (new_x >= 0 && new_y >= 0 && new_x < n && new_y < n) {
                    map[new_x][new_y] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

    }
}
