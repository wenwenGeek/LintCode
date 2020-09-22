import java.util.ArrayList;
import java.util.List;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa78 {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        int sum = (2 << nums.length - 1) - 1;
        List<List<Integer>> returnList = new ArrayList<>();
        for (int i = 0; i <= sum; i++) {
            List<Integer> result = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (int) Math.pow(2, j )) == (int) Math.pow(2, j )) {
                    result.add(nums[j ]);
                }
            }
            returnList.add(result);
        }
        return returnList;
    }

}
