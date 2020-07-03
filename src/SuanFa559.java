import java.util.ArrayList;
import java.util.List;

/**
 * SuanFa559
 *
 * @Author bowen.cui
 * @Date 2020/6/4 16:28
 **/
public class SuanFa559 {

    public int maxDepth(Node root) {
        if(root==null) return 0;
        return getMax(1, root.children);
    }

    public int getMax(int nodeCount, List<Node> node) {
        if (node == null || node.size() == 0) {
            return nodeCount;
        }

        List<Node> childNode = new ArrayList<>();
        for (Node node1 : node) {
            if (node1.children != null && node1.children.size() > 0) {
                childNode.addAll(node1.children);
            }
        }
        return getMax(nodeCount+1,childNode);
    }

    public int getMaxDept(int node, Node root) {
        if (root == null) {
            return node;
        }
        if (root.children == null || root.children.size() == 0) {
            return node;
        }

        int max = node;
        for (Node child : root.children) {
            int nowCount = getMaxDept(node + 1, child);
            if (nowCount > node) {
                max = nowCount;
            }
        }
        return max;
    }

}

class Node {

    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};