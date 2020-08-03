import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
public class SuanFa3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("c"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<String> stringSet = new HashSet<>(26);

        int maxCount = 0;
        int count;
        for (int i = 0; i < s.length(); i++) {
            stringSet.clear();
            count = 0;
            for (int i1 = i; i1 < s.length() && s.length() - i > maxCount; i1++) {
                if (stringSet.contains(String.valueOf(s.charAt(i1)))) {
                    break;
                }
                count++;
                stringSet.add(String.valueOf(s.charAt(i1)));
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;

    }

}
