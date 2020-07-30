/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa398 {

    public static void main(String[] args) {
        findTheDifference("abcd", "abcde");
    }
    public static char findTheDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int[] num = new int[26];

        for(int i=0;i<tt.length;i++){
            if(i != s.length()){
                num[(int)ss[i]-97] +=1;
            }
            num[(int)tt[i]-97] -=1;
        }

        for (int i = 0; i < num.length; i++) {
            if(num[i]!=0)
                return (char)(i+97);
        }
        return (char)97;

    }

}
