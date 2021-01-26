package 练习.数组;

/**
 * 寻找两个正序数组的中位数_4
 *
 * @author bowen.cui
 **/
public class 寻找两个正序数组的中位数_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int number1Size = nums1.length;
        int number2Size = nums2.length;

        if (number1Size == 0) {
            if (number2Size % 2 != 0) {
                return (nums2[number2Size / 2] + nums2[number2Size / 2 - 1]) / 2.0;
            } else {
                return nums2[number2Size / 2] / 2.0;
            }
        }

        if (number2Size == 0) {
            if (number1Size % 2 != 0) {
                return (nums1[number1Size / 2] + nums1[number1Size / 2 - 1]) / 2.0;
            } else {
                return nums1[number1Size / 2] / 2.0;
            }
        }

        int sumCount = (number1Size + number2Size) / 2 + 2;
        int[] sum = new int[sumCount];

        int i = 0, j = 0, count = 0;
        while ((i + j) < sumCount) {
            if (i >= number1Size) {
                sum[count++] = nums2[j++];
                continue;
            }

            if (j >= number2Size) {
                sum[count++] = nums1[i++];
                continue;
            }

            if (nums1[i] > nums2[j]) {
                sum[count++] = nums2[j++];
            } else {
                sum[count++] = nums1[i++];
            }
        }

        if ((number1Size + number2Size) % 2 == 0) {
            return (sum[(number1Size + number2Size) / 2 - 1] + sum[(number1Size + number2Size) / 2]) / 2.0;
        }else{
            return  sum[(number1Size + number2Size) / 2];
        }

    }

}
