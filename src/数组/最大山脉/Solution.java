package 数组.最大山脉;

class Solution {

    public boolean validMountainArray(int[] A) {

        boolean isdao = false;
        int i = 1;
        for (; i < A.length - 1; i++) {
            if (!isdao) {
                if (A[i] <= A[i - 1]) {
                    return false;
                }
                isdao = A[i] > A[i - 1] && A[i] > A[i + 1];

            } else {
                if (A[i] <= A[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean validMountainArray1(int[] A) {

        int shanIndex = 0;
        boolean isDao = false;
        int i = 1;
        for (; i < A.length - 1; i++) {



        }
        return true;
    }
}