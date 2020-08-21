import java.util.LinkedList;
import java.util.OptionalInt;
import java.util.Queue;
import javax.xml.ws.soap.Addressing;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa415 {

    public static void main(String[] args) {
        System.out.println(addStrings("123", "789"));
    }

    public static String addStrings(String num1, String num2) {


        Queue<Integer> queue1 = new LinkedList<Integer>();
        Queue<Integer> queue2 = new LinkedList<Integer>();

        for (int i = num1.toCharArray().length - 1; i >= 0; i--) {
            queue1.offer((int) num1.toCharArray()[i] - 48);
        }
        for (int i = num2.toCharArray().length - 1; i >= 0; i--) {
            queue2.offer((int) num2.toCharArray()[i] - 48);
        }

        int count = 0;
        StringBuilder returnSum = new StringBuilder();
        while (true) {
            if (queue1.isEmpty() && queue2.isEmpty()) {
                break;
            }

            int a = 0, b = 0;

            if (!queue1.isEmpty()) {
                a = queue1.poll();
            }
            if (!queue2.isEmpty()) {
                b = queue2.poll();
            }

            int c = a + b + count;

            returnSum.insert(0, c % 10);

            count = c / 10;
        }

        if (count > 0) {
            returnSum.insert(0, count);
        }
        return returnSum.toString();


    }

}
