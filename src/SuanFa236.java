import java.util.ArrayList;
import java.util.List;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa236 {

    public static void main(String[] args) {
        TreeNode xinde = shegncheng(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4, null, null, null, null});
        System.out.println(lowestCommonAncestor(xinde, new TreeNode(5), new TreeNode(1)));
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<List<TreeNode>> reulstP = new ArrayList();
        List<List<TreeNode>> reulstQ = new ArrayList();
        zuxian(root, p, q, new ArrayList<>(), reulstP, reulstQ);
        int count = 0;
        TreeNode lastNode = null;
        while (reulstP.get(0).size() > count && reulstQ.get(0).size() > count) {
            if (reulstP.get(0).get(count) == reulstQ.get(0).get(count)) {
                lastNode = reulstP.get(0).get(count);
            }
            count++;
        }
        return lastNode;

    }

    public static void zuxian(TreeNode root, TreeNode findp, TreeNode findQ, List<TreeNode> path, List<List<TreeNode>> resultP, List<List<TreeNode>> resultQ) {
        if (root == null) return;
        path.add(root);
        if (root == findp) {
            resultP.add(new ArrayList<>(path));
        }
        if (root == findQ) {
            resultQ.add(new ArrayList<>(path));
        }

        zuxian(root.left, findp, findQ, path, resultP, resultQ);
        zuxian(root.right, findp, findQ, path, resultP, resultQ);

        path.remove(path.size() - 1);
    }

    public static TreeNode shegncheng(Integer[] tree) {
        TreeNode root = new TreeNode(tree[0]);
        List<TreeNode> treeNodes = new ArrayList<>();
        treeNodes.add(root);
        int count = 1;
        while (count < tree.length - 1) {
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
