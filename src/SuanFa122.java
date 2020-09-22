import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa122 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    public static int maxProfit(int[] prices) {

        int now = prices[0];
        int sum = 0;
        int oneSum = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - now > oneSum) {
                oneSum = prices[i] - now;
            } else {
                sum = sum + prices[i - 1] - now;
                now = prices[i];
                oneSum = 0;
            }
        }
        return sum + oneSum;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        List<List<Integer>> returnList = new ArrayList<>();
        Set<String> daanSet = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int b = nums[j];
                int c = 0 - (a + b);
                if (numSet.contains(c)) {
                    List<Integer> aList = new ArrayList<>();
                    aList.add(a);
                    aList.add(b);
                    aList.add(c);
                    Collections.sort(aList);
                    String aa = aList.get(0) + "_" + aList.get(1) + "_" + aList.get(2);
                    if (!daanSet.contains(aa)) {
                        daanSet.add(aa);
                        returnList.add(aList);
                    }
                }
            }
        }
        return returnList;
    }
}
