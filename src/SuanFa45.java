import java.util.HashSet;
import java.util.Set;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa45 {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{3, 4, 3, 2, 5, 4, 3}));
        System.out.println(canJump(new int[]{1, 1, 1, 1}));
    }

    public static int canJump(int[] nums) {
/*
        if (nums.length == 1) {
            return 0;
        }

        int step = 1;
        int zuida = nums[0];

        int now = zuida;
        while (true) {
            step++;

            if (now >= nums.length - 1) {
                return step;
            }

            if (zuida >= nums.length - 1) {
                return step;
            }

            for (int i = now; i < now + nums[now]; i++) {
                zuida = Math.max(zuida, nums[i] + i);
                if (zuida >= nums.length - 1) {
                    continue;
                }
            }
            if (zuida < nums.length - 1&&nums[zuida] == 0) {
                return 0;
            }
            now = zuida;
        }*/

        int end = 0;

        int step = 0;

        int maxLength = 0;
        for (int i = 0; i < nums.length-1; i++) {

            maxLength = Math.max(maxLength, i + nums[i]);
            if (i == end) {
                end = maxLength;
                step++;
            }

        }
        return step;

    }


    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hasSet = new HashSet<>();
        Set<Integer> returnSet = new HashSet<>();

        for (int i : nums1) {
            hasSet.add(i);
        }
        for (int i : nums2) {
            if(hasSet.contains(i)){
                returnSet.add(i);
            }
        }
        return returnSet.stream().mapToInt(i->i).toArray();
    }
}
