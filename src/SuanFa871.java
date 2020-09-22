import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa871 {

    public static void main(String[] args) {
        //                  加                                       加
        int[][] matrix = {{10, 60}, {20, 30}, {30, 30}, {60, 40}};
        System.out.println(minRefuelStops(100, 10, matrix));
    }

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        if (startFuel >= target) return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        for (int i = 0; i < stations.length; i++) {
            while (startFuel < stations[i][0]) {
                if (pq.isEmpty()) return -1;
                startFuel += pq.poll();
                count++;
            }

            if (startFuel >= target) {
                return count;
            }
            pq.add(stations[i][1]);
        }
        while (true) {
            if (pq.isEmpty()) return -1;
            startFuel += pq.poll();
            count++;

            if (startFuel >= target) {
                return count;
            }
        }
    }
}
