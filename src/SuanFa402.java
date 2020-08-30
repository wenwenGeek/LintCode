
import java.util.Stack;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa402 {

    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));
    }

    public static String removeKdigits(String num, int k) {

        if (num.length() == k) return "0";

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && k > 0) {
                if (stack.peek() > num.charAt(i) - '0') {
                    stack.pop();
                    k--;
                } else {
                    break;
                }
            }
            stack.push(num.charAt(i) - '0');
        }
        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder newString = new StringBuilder();
        while (!stack.isEmpty()) {
            newString.insert(0, stack.pop());
        }


        for (int i = 0; i < newString.length(); i++) {
            if (newString.charAt(i) == '0') {
                newString.deleteCharAt(i);
                i--;
                continue;
            }
            break;
        }

        if (newString.length() == 0) {
            return "0";
        }

        return newString.toString();
    }

}
