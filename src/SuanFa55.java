/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa55 {

    public int maxSubArray(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int sum_a;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            sum_a = nums[i];
            if (sum_a > max) {
                max = sum_a;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum_a += nums[j];
                if (sum_a > max) {
                    max = sum_a;
                }
            }

        }
        return max;

    }

}
