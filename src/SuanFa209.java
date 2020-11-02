import sun.security.provider.Sun;

public class SuanFa209 {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1, 2, 3, 4, 5}));
    }

    public static int minSubArrayLen(int s, int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int sum = nums[0];

        int begin = 0;
        int now = 0;

        int minCount = 99999999;

        while (now < nums.length) {

            if (sum >= s) {
                minCount = Math.min(minCount, now - begin + 1);
                sum -= nums[begin];
                begin++;
            } else {
                now++;
                if (now >= nums.length) {
                    break;
                }
                sum += nums[now];
            }
        }

        if (minCount == 99999999) {
            return 0;
        }

        return minCount;

    }

}
