/**
 * 在一个给定的数组nums中，总是存在一个最大元素 。
 *
 * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
 *
 * 如果是，则返回最大元素的索引，否则返回-1。
 *
 * 示例 1:
 *
 * 输入: nums = [3, 6, 1, 0]
 * 输出: 1
 * 解释: 6是最大的整数, 对于数组中的其他整数,
 * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
 *
 *
 * 示例 2:
 *
 * 输入: nums = [1, 2, 3, 4]
 * 输出: -1
 * 解释: 4没有超过3的两倍大, 所以我们返回 -1.
 *
 *
 * 提示:
 *
 * nums 的长度范围在[1, 50].
 * 每个 nums[i] 的整数范围在 [0, 100].
 */
public class SuanFa747 {

    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[]{0, 0, 0, 1}));
    }

    public static int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int maxCount = 0;
        int[] maxNum = new int[2];

        if (nums[0] > nums[1]) {
            maxNum[0] = nums[0];
            maxNum[1] = nums[1];
        } else {
            maxNum[0] = nums[1];
            maxNum[1] = nums[0];
            maxCount = 1;
        }

        if(nums.length==2){
            return maxCount;
        }

        for (int i = 2; i < nums.length; i++) {
            int numa = nums[i];
            if (numa > maxNum[1]) {
                if (numa > maxNum[0]) {
                    maxNum[1] = maxNum[0];
                    maxNum[0] = numa;
                    maxCount = i;
                }else {
                    maxNum[1]= numa;
                }
            }
        }

        if (maxNum[1] * 2 <= maxNum[0]) {
            return maxCount;
        }
        return -1;
    }

}
