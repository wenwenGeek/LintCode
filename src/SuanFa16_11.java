import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 *
 * 返回的长度需要从小到大排列。
 *
 * 示例：
 *
 * 输入：
 * shorter = 1
 * longer = 2
 * k = 3
 * 输出： {3,4,5,6}
 * 提示：
 *
 * 0 < shorter <= longer
 * 0 <= k <= 100000
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/diving-board-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SuanFa16_11 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divingBoard(2, 100, 5)));
        // 10   108     206     304     402   500
    }

    public static int[] divingBoard(int shorter, int longer, int k) {

        if (k == 0) {
            return new int[]{};
        }
        if (k == 1) {
            return new int[]{shorter, longer};
        }

        if (shorter == longer) {
            return new int[]{shorter * k};
        }

        int min = shorter * k;
        int max = longer * k;

        int[] returnNumb = new int[(max - min) / (longer - shorter) + 1];
        returnNumb[0] = min;
        int index = 1;
        while (true) {
            returnNumb[index] = returnNumb[index - 1] + (longer - shorter);
            if (returnNumb[index] == max) {
                return returnNumb;
            }
            index++;
        }
    }

}
