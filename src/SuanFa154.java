/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa154 {

    public int findMin(int[] nums) {
        int it = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<it)
                return nums[i];
        }
        return it;
    }

}
