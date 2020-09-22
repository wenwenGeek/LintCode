import java.util.*;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa22 {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {

        List<String> returnList = new ArrayList<>();
        digui(n, returnList, "");
        return returnList;

    }

    public static void digui(int n, List<String> returnList, String result) {
        if (result.length() == 2 * n) {
            if (valid(result)) {
                returnList.add(result);
            }
            return;
        }

        int kuohao = 0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i) == '(') kuohao++;
            if (kuohao > 3) return;
        }

        digui(n, returnList, result + '(');
        digui(n, returnList, result + ')');

    }

    public static boolean valid(String aaa) {
        System.out.println("验证：" + aaa);
        int balance = 0;
        for (int i = 0; i < aaa.length(); i++) {
            if (aaa.charAt(i) == '(') balance++;
            if (aaa.charAt(i) == ')') balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }


}
