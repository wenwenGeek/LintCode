
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class SuanFa224 {

    public static void main(String[] args) {
        System.out.println(calculate("1+1"));
    }
    /*public static int calculate(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        int operand = 0;
        int result = 0; // For the on-going result
        int sign = 1;  // 1 means positive, -1 means negative

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {

                // Forming operand, since it could be more than one digit
                operand = 10 * operand + (int) (ch - '0');

            } else if (ch == '+') {

                // Evaluate the expression to the left,
                // with result, sign, operand
                result += sign * operand;

                // Save the recently encountered '+' sign
                sign = 1;

                // Reset operand
                operand = 0;

            } else if (ch == '-') {

                result += sign * operand;
                sign = -1;
                operand = 0;

            } else if (ch == '(') {

                // Push the result and sign on to the stack, for later
                // We push the result first, then sign
                stack.push(result);
                stack.push(sign);

                // Reset operand and result, as if new evaluation begins for the new sub-expression
                sign = 1;
                result = 0;

            } else if (ch == ')') {

                // Evaluate the expression to the left
                // with result, sign and operand
                result += sign * operand;

                // ')' marks end of expression within a set of parenthesis
                // Its result is multiplied with sign on top of stack
                // as stack.pop() is the sign before the parenthesis
                result *= stack.pop();

                // Then add to the next operand on the top.
                // as stack.pop() is the result calculated before this parenthesis
                // (operand on stack) + (sign on stack * (result from parenthesis))
                result += stack.pop();

                // Reset the operand
                operand = 0;
            }
        }
        return result + (sign * operand);
    }*/

    public static int calculate(String s) {
        s = s.replaceAll(" ","");
        Stack<Integer> stack = new Stack<>();
        int temp = 0;
        int zhengfu = 1;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            if(schar>='0'&&schar<='9'){
                temp = temp*10 + (schar-(char)'0');
            }else{
                if(schar == '+'){
                    result += temp * zhengfu;
                    zhengfu = 1;
                    temp = 0;

                }else  if(schar == '-'){
                    result += temp * zhengfu;
                    zhengfu = -1;
                    temp = 0;
                }else  if(schar == '('){
                    stack.push(result);
                    stack.push(zhengfu);
                    zhengfu = 1;
                    result=0;
                    temp = 0;
                }else  if(schar == ')'){
                    result += temp * zhengfu;
                    result = result*stack.pop();
                    result = result+stack.pop();
                    temp=0;
                }
            }
        }
        return result+temp*zhengfu;
    }


/*
    public static int calculate(String s) {
        s = s.replaceAll(" ","");
        int[] sNum = new int[s.length()];
        int[] fNum = new int[s.length()];
        int kuohaoCount = 0;
        int fuck = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                kuohaoCount ++;
                fuck++;
                if(i!=0){
                    if(s.charAt(i-1) == '-'){
                        fNum[fuck] = -1;
                    }
                }
                continue;
            }
            if(s.charAt(i) == ')'){
                kuohaoCount --;
                continue;
            }
            int fuhao = 1;
            if(s.charAt(i) == '-' ){
                fuhao = -1;
                i++;
            }
            if(s.charAt(i) == '+' ){
                i++;
            }
            StringBuilder a = new StringBuilder();
            while (i<s.length()){
                char b = s.charAt(i);
                if(b=='-'||b=='+'||b=='('||b==')') {
                    i--;
                    break;
                }
                a.append( b);
                i++;
            }
            if(!a.toString().equals("")){
                sNum[kuohaoCount] += Integer.parseInt(a.toString())*fuhao;
            }
        }
        int sumNum = 0;
        for (int i = 0; i < sNum.length; i++) {
            if(fNum[i] == -1 ){
                sumNum =sumNum - sNum[i];
            }else{
                sumNum =sumNum + sNum[i];

            }
        }
        return sumNum;

    }*/

}
