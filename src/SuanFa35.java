/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa35 {

    public static void main(String[] args) {
        /*[1,3,5,6], 5*/
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));

    }

    public static int searchInsert(int[] nums, int target) {

        if (target <= nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }

        for (int i = 1; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
/*        int min = 0;
        int max = nums[nums.length - 1];
        int center = nums.length / 2 + 1;

        while (true){
            int numCenter = nums[center];
            if(numCenter == target) return center;
            if (target < numCenter) {
                if(nums[center-1]<target) return center;
                if(nums[center+1]>target) return center+1;

                min = center;
                center = (max-center)/2+1;
            }

            if (target > numCenter) {
                if(nums[center+1]>target) return center+1;

                max = center;
                center = (max-min)/2+1;
            }
        }*/

    }

}
