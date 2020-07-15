import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 *
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 *
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SuanFa350 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(intersect(new int[]{1, 2}, new int[]{1, 1})));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        int count1 = nums1.length;
        int count2 = nums2.length;

        if (count1 == 0 || count2 == 0) {
            return new int[]{};
        }

        if (count1 < count2) {
            return myintersect(nums1, nums2);
        } else {
            return myintersect(nums2, nums1);
        }

    }

    public static int[] myintersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hashMap1 = new HashMap<>();
        Map<Integer, Integer> hashMap2 = new HashMap<>();
        for (int i : nums1) {
            if (hashMap1.containsKey(i)) {
                hashMap1.put(i, hashMap1.get(i) + 1);
                continue;
            } else {
                hashMap1.put(i, 1);
            }
            for (int j : nums2) {
                if (i == j) {
                    if (hashMap2.containsKey(i)) {
                        hashMap2.put(i, hashMap2.get(i) + 1);
                    } else {
                        hashMap2.put(i, 1);
                    }
                }
            }
        }

        List<Integer> returnList = new ArrayList<>();
        for (Integer i2 : hashMap2.keySet()) {
            int count1 = hashMap1.get(i2);
            int count2 = hashMap2.get(i2);

            for (int jj = 0; jj < (Math.min(count1, count2)); jj++) {
                returnList.add(i2);
            }

        }

        int[] a = new int[returnList.size()];
        for (int i = 0; i < returnList.size(); i++) {
            a[i] = returnList.get(i);
        }

        return a;
    }

}
