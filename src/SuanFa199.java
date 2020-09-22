import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa199 {

    public static void main(String[] args) {

        TreeNode shegncheng = shegncheng(new Integer[]{1, 2, 3, null, 5, null, 4});
        System.out.println(rightSideView(shegncheng));
    }

    public static List<Integer> rightSideView(TreeNode root) {

        List<Integer> returnList = new ArrayList<>();
        List<TreeNode> cengNode = new ArrayList<>();
        cengNode.add(root);
        while (cengNode!=null&&!cengNode.isEmpty()&&cengNode.size()>0) {
            List<TreeNode> tempList = new ArrayList<>();
            returnList.add(cengNode.get(cengNode.size() - 1).val);
            for (TreeNode treeNode : cengNode) {
                if (treeNode.left != null) {
                    tempList.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    tempList.add(treeNode.right);
                }
            }
            cengNode.removeAll(cengNode);
            cengNode.addAll(new ArrayList<>(tempList));
        }
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
