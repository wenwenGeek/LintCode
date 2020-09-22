import javax.transaction.TransactionRequiredException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa113 {

    public static void main(String[] args) {
        TreeNode xinde = shegncheng(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});

        System.out.println(pathSum(xinde, 22));
    }

    public static void digui(int sum, TreeNode treeNode, List<Integer> resultList, List<List<Integer>> returnList) {
        if (treeNode == null) {
            return;
        }
        resultList.add(treeNode.val);
        if (treeNode.left == null && treeNode.right == null && sum == treeNode.val) {
            returnList.add(new ArrayList<>(resultList));
        }

        digui(sum - treeNode.val, treeNode.left, resultList, returnList);
        digui(sum - treeNode.val, treeNode.right, resultList, returnList);
        resultList.remove(resultList.size() - 1);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> stack = new ArrayList<>();
        List<List<Integer>> returnList = new ArrayList<>();
        digui(sum, root, stack, returnList);
        return returnList;
    }

    public static TreeNode shegncheng(Integer[] tree) {
        TreeNode root = new TreeNode(tree[0]);
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        int count = 1;
        while (count <= tree.length - 1) {
            List<TreeNode> tempList = new ArrayList<>();

            for (TreeNode treeNode : treeNodes) {
                Integer leftVal = tree[count++];
                if (leftVal != null) {
                    treeNode.left = new TreeNode(leftVal);
                    tempList.add(treeNode.left);
                }
                Integer rightVal = tree[count++];
                if (rightVal != null) {
                    treeNode.right = new TreeNode(rightVal);
                    tempList.add(treeNode.right);
                }
            }
            treeNodes = tempList;
        }
        return root;
    }
}
