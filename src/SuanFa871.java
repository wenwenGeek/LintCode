import java.util.Arrays;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa871 {

    public static void main(String[] args) {
        int[][] matrix = {{0, 30}, {15, 20}, {5, 10}, {-10, 20}};
        System.out.println(findMinArrowShots(matrix));
    }

    public static int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, (a, b) -> a[0] - b[0]);

        int[] nowMin = points[0];

        int jian = 1;

        for (int i = 1; i < points.length; i++) {
            int[] newQiqiu = points[i];

            if (newQiqiu[0] >= nowMin[0] && newQiqiu[0] <= nowMin[1]) {
                nowMin[0] = newQiqiu[0];
                if (newQiqiu[1] < nowMin[1]) {
                    nowMin[1] = newQiqiu[1];
                }
            } else {
                jian++;
                nowMin = newQiqiu;
            }
        }

        return jian;
    }

}
