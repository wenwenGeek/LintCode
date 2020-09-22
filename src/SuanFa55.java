/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa55 {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
    }

    public static boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }
        if (nums[0] == 0) {
            return false;
        }
        int zeroCount = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0 && i != nums.length - 1) {
                zeroCount++;
                continue;
            }
            if (zeroCount > 0) {
                if (zeroCount < nums[i]) {
                    zeroCount = 0;
                    continue;
                } else {
                    zeroCount++;
                }
            }
        }
        return zeroCount == 0;
    }

}
