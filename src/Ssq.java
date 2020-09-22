import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Ssq
 *
 * @author bowen.cui
 * @date 2020/9/4 14:40
 **/
public class Ssq {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        System.out.println("========================================================");
        System.out.println("\t\t\t\t\t\t欢迎使用，《谁用谁中奖 V1.1》小程序");
        System.out.println("========================================================");
        System.out.println("\n\n");
        int[] str = new int[6];
        Set<Integer> numssss= new HashSet<>();
        for (int i = 0; i < 6; i++) {
            str[i] = 1 + (int) Math.floor(Math.random() * 33);
            if(numssss.contains(str[i])){
                i--;
            }else{
                numssss.add(str[i]);
                priorityQueue.add(str[i]);
            }
        }
        System.out.print("红色球：\t");
        while (!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll() + "\t\t");
        }
        System.out.println();

        System.out.print("蓝色球：\t" + (1 + (int) Math.floor(Math.random() * 16)));
        System.out.println("\n\n\n");
        System.out.println("========================================================");
    }

}
