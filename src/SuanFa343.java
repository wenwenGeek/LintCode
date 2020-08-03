/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa343 {

    public int integerBreak(int n) {

        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int a = n / 3;
        int b = n % 3;

        if (b == 1) {
            return (int) (Math.pow(3, a - 1) * 4);
        }
        if (b == 0) {
            return (int) (Math.pow(3, a));
        }
        return (int) (Math.pow(3, a) * 2);

    }

}
