import java.util.ArrayList;
import java.util.List;

/**
 * SuanFa32
 *
 * @Author bowen.cui
 * @Date 2020/6/4 15:39
 **/
public class SuanFa32 {

    public int[] levelOrder(TreeNode1 root) {
        if (root == null) {
            return new int[]{};
        }

        List<TreeNode1> needTree = new ArrayList<>();
        List<TreeNode1> AllTree = new ArrayList<>();
        needTree.add(root);

        while (needTree != null && needTree.size() > 0) {
            AllTree.addAll(needTree);
            needTree = returnNextNod(needTree);

        }
        return AllTree.stream().mapToInt(treeNode -> treeNode.val).toArray();
    }

    public List<TreeNode1> returnNextNod(List<TreeNode1> thisNodes) {
        if (thisNodes == null || thisNodes.size() == 0) {
            return null;
        }

        List<TreeNode1> returnNode = new ArrayList<>();
        for (TreeNode1 thisNode : thisNodes) {
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

class TreeNode1 {

    int val;
    TreeNode1 left;
    TreeNode1 right;

    TreeNode1(int x) {
        val = x;
    }
}
