/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa376 {

    public static void main(String[] args) {
        System.out.println(wiggleMaxLength(new int[]{0, 0}));
    }

    public static int wiggleMaxLength(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;


        int max = 1;

        int begin = 0;
        boolean hopeZheng = false;
        while (begin < nums.length) {
            if (nums[begin] == nums[begin + 1]) {
                begin++;
                if (begin == nums.length - 1) return 1;
                continue;
            } else {
                max++;
                hopeZheng = (nums[begin] > nums[begin + 1]);
                break;
            }
        }

        for (int i = begin + 1; i <= nums.length - 1; i++) {
            if (hopeZheng) {
                if (nums[i - 1] < nums[i]) {
                    hopeZheng = false;
                    max++;
                }
            } else {
                if (nums[i - 1] > nums[i]) {
                    hopeZheng = true;
                    max++;
                }
            }

        }
        return max;

    }

}
