package 字符串.回文字符串.最长回文子串;

/**
 * Solution
 *
 * @author bowen.cui
 **/
public class Solution {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("ac"));
    }

    public static String longestPalindrome(String s) {


        if(s.length() ==1) return s;
        String maxLengthStr = s.substring(0, 1);
        int maxCount = 1;

        for (int i = 0; i < s.length(); i++) {

            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < s.length()) {

                if (s.charAt(left) == s.charAt(right)) {
                    if (right - left + 1 > maxCount) {
                        maxLengthStr = s.substring(left , right+1);
                        maxCount = right - left + 1;
                    }
                    left -= 1;
                    right += 1;
                } else {
                    break;
                }
            }

            left = i-1;
            right = i;
            while (left >= 0 && right < s.length()) {

                if (s.charAt(left) == s.charAt(right)) {
                    if (right - left + 1 > maxCount) {
                        maxLengthStr = s.substring(left , right+1);
                        maxCount = right - left + 1;
                    }
                    left -= 1;
                    right += 1;
                } else {
                    break;
                }
            }

        }

        return maxLengthStr;
    }

}
