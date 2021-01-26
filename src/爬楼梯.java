/**
 * 爬楼梯
 *
 * @Author bowen.cui
 * @Date 2020/12/13 19:41
 **/
public class 爬楼梯 {

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
        int[] dp = new int[n+3];
        dp[1]=1;
        dp[2]=2;
        for(int i = 3;i<=n;i++){

            dp[i] = dp[i-1]+dp[i-2];

        }

        return dp[n];
    }
}
