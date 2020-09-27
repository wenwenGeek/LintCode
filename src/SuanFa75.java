import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import java.util.List;
import jdk.nashorn.internal.runtime.JSONFunctions;

/**
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 *
 * 链接：https://leetcode-cn.com/problems/permutations
 */
public class SuanFa75 {

    public static void main(String[] args) {
        sortColors(new int[]{2, 0, 2, 1, 1, 0});
    }

    public static void sortColors(int[] nums) {

        int begin = 0;
        int end = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (i > begin) {
                    nums[begin] = nums[begin] ^ nums[i];
                    nums[i] = nums[begin] ^ nums[i];
                    nums[begin] = nums[begin] ^ nums[i];
                    i--;
                }
                begin++;
                continue;
            }
            if (nums[i] == 2) {
                if (i < end) {
                    nums[end] = nums[end] ^ nums[i];
                    nums[i] = nums[end] ^ nums[i];
                    nums[end] = nums[end] ^ nums[i];
                    i--;
                }
                end--;
                continue;
            }
        }

    }

}
