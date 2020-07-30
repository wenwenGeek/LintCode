/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa1227 {

    public static void main(String[] args) {
        System.out.println(aaa(3));
    }

    public static double nthPersonGetsNthSeat(int n) {
        return 1/aaa(n);
    }

    public static double aaa(double i){
        if(i==1) return 1;
        return i*aaa(i-1);
    }

}
