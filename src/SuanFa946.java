import java.util.Stack;

public class SuanFa946 {

    public static void main(String[] args) {
        System.out.println(validateStackSequences(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1}));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        int index = 0;
        Stack stack = new Stack();
        for (int i : pushed) {
            stack.push(i);

            while (true){
                if(stack.isEmpty() || index == popped.length) break;
                if((int)stack.peek() == popped[index]){
                    stack.pop();
                    index++;
                }  else{
                    break;
                }
            }

        }
        return stack.isEmpty();

    }

}
