import java.util.Stack;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa20 {

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {


        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') {
                charStack.push(s.charAt(i));
            } else {
                if(charStack.isEmpty()) return false;
                if (s.charAt(i) == '}') {
                    if (charStack.pop() != '{') {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (charStack.pop() != '[') {
                        return false;
                    }
                } else if (s.charAt(i) == ')') {
                    if (charStack.pop() != '(') {
                        return false;
                    }
                } else {
                    charStack.push(s.charAt(i));
                }
            }
        }
        return charStack.isEmpty();

    }

}
