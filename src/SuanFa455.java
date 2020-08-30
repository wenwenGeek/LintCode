import java.util.PriorityQueue;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa455 {


    public int findContentChildren(int[] g, int[] s) {

        PriorityQueue<Integer> gQueue = new PriorityQueue<>();
        PriorityQueue<Integer> sQueue = new PriorityQueue<>();


        for (int i : g) {
            gQueue.add(i);
        }
        for (int i : s) {
            sQueue.add(i);
        }

        int sum = 0;
        while (!sQueue.isEmpty() && !gQueue.isEmpty()) {
            if (sQueue.poll() >= gQueue.peek()) {
                gQueue.poll();
                sum++;
            }
        }
        return sum;

    }

}
