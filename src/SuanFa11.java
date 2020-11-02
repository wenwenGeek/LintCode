/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa11 {

    public int maxArea(int[] height) {

        int max = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max((j - i) * Math.min(height[i], height[j]), max);
            }
        }
        return max;

    }

}
