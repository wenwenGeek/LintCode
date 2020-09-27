import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
//
//
//
// 示例：
//二叉树：[3,9,20,null,null,15,7],
//
//     3
//   / \
//  9  20
//    /  \
//   15   7
//
//
// 返回其层次遍历结果：
//
// [
//  [3],
//  [9,20],
//  [15,7]
//]
//
// Related Topics 树 广度优先搜索
// 👍 644 👎 0

//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class SuanFa102 {

    public static void main(String[] args) {
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> treeNodes = new LinkedList<>();
        treeNodes.add(root);
        List<List<Integer>> returnList = new ArrayList<>();

        while (!treeNodes.isEmpty()) {
            Queue<TreeNode> tempQueue = new LinkedList<>();
            List<Integer> neiList = new ArrayList<>();
            while (!treeNodes.isEmpty()) {
                TreeNode poll = treeNodes.poll();
                if (poll == null) {
                    break;
                }
                neiList.add(poll.val);
                if (poll.left != null) {
                    tempQueue.add(poll.left);
                }
                if (poll.right != null) {
                    tempQueue.add(poll.right);
                }
            }
            treeNodes = tempQueue;
            if (neiList.size() != 0) {
                returnList.add(neiList);
            }
        }
        return returnList;
    }

}
