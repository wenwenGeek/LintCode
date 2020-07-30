/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa392 {

    public static void main(String[] args) {
    }

    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0 ) return true;

        byte[] tbyte = t.getBytes();
        byte[] sbyte = s.getBytes();

        int index = 0;
        for (byte b : tbyte) {
            if (b == sbyte[index]) {
                index++;
            }
            if (index == s.length()) {
                return true;
            }
        }
        return false;

    }

}
