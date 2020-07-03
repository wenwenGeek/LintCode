import java.util.ArrayList;
import java.util.List;

/**
 * SuanFa32
 *
 * @Author bowen.cui
 * @Date 2020/6/4 15:39
 **/
public class SuanFa32 {

    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }

        List<TreeNode> needTree = new ArrayList<>();
        List<TreeNode> AllTree = new ArrayList<>();
        needTree.add(root);

        while (needTree != null && needTree.size() > 0) {
            AllTree.addAll(needTree);
            needTree = returnNextNod(needTree);

        }
        return AllTree.stream().mapToInt(treeNode -> treeNode.val).toArray();
    }

    public List<TreeNode> returnNextNod(List<TreeNode> thisNodes) {
        if (thisNodes == null || thisNodes.size() == 0) {
            return null;
        }

        List<TreeNode> returnNode = new ArrayList<>();
        for (TreeNode thisNode : thisNodes) {
            if (thisNode.left != null) {
                returnNode.add(thisNode.left);
            }
            if (thisNode.right != null) {
                returnNode.add(thisNode.right);
            }
        }
        return returnNode;
    }
}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
