import java.util.*;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa40 {

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }


    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> returnList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();
        for (int candidate : candidates) {
            if (candidate <= target) {
                numList.add(candidate);
            }
        }

        Set<String> resultSet = new HashSet<>();
        List<Integer> valueList = new ArrayList<>();
        int sum = 0;
        digui(0, numList, resultSet, target, valueList, returnList, sum);
        return returnList;

    }

    private static void digui(int i, List<Integer> numList, Set<String> resultSet, int target, List<Integer> valueList, List<List<Integer>> returnList, int sum) {
        if (i >= numList.size()) {
            System.out.println("遍历到" + i + "结束-----------------------");
            return;
        }
        if (sum > target) {
            System.out.println("遍历到sum = " + sum + "结束-----------------------");
            return;
        }

        int a = numList.get(i);
        sum += a;
        valueList.add(a);
        Collections.sort(valueList);
        if (sum == target && !resultSet.contains(valueList.toString())) {
            returnList.add(valueList);
            resultSet.add(valueList.toString());
        }
        System.out.println("准备第" + (i + 1) + "次调用，当前sum=" + sum + "valueList=" + valueList.toString());
        System.out.println("当前returlList" + returnList.toString());
        digui(i + 1, numList, resultSet, target, valueList, returnList, sum);
        sum = sum - valueList.get(valueList.size()-1);
        valueList.remove(valueList.size()-1);
        System.out.println("准备回溯第" + (i + 1) + "次调用，当前sum=" + sum + "valueList=" + valueList.toString());
        digui(i + 1, numList, resultSet, target, valueList, returnList, sum);

    }


}
