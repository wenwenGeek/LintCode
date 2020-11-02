import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.zip.CheckedInputStream;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa101 {

    public static void main(String[] args) {
        TreeNode newTree = shegncheng(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        /*System.out.println(isSymmetric(newTree));*/
    }

    public  boolean isSymmetric(TreeNode root) {
        return check(root.left, root.right);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if(p == null || q == null){
            return false;
        }

        return p.val == q.val && check(p.left ,q.right) && check(p.right, q.left);
    }


    /*public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null && root.right != null) {
            return false;
        }
        if (root.left != null && root.right == null) {
            return false;
        }

        if (root.left != null) {

            Stack<TreeNode> leftQueue = new Stack<>();
            leftQueue.add(root.left);

            Queue<TreeNode> rightQueue = new LinkedList<>();
            rightQueue.add(root.right);

            while (!leftQueue.isEmpty()) {
                Stack<TreeNode> newLeftQueue = new Stack<>();
                Queue<TreeNode> newRightQueue = new LinkedList<>();

                while (!leftQueue.isEmpty()) {
                    TreeNode left = leftQueue.pop();
                    TreeNode right = rightQueue.poll();

                    if (left == null && right != null) {
                        return false;
                    }
                    if (left != null && right == null) {
                        return false;
                    }
                    if (left == null) {
                        continue;
                    }

                    if (left.val != right.val) {
                        return false;
                    }

                    newLeftQueue.add(left.left);
                    newLeftQueue.add(left.right);

                    newRightQueue.add(right.left);
                    newRightQueue.add(right.right);

                }
                leftQueue = newLeftQueue;
                rightQueue = newRightQueue;

            }
            if (!rightQueue.isEmpty()) {
                return false;
            }
        }
        return true;
    }*/

    /*public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true;
        }

        if (root.left != null && root.right != null) {

            Stack<TreeNode> nodeStack = new Stack<>();

            Queue<TreeNode> leftQueue = new LinkedList<>();
            leftQueue.add(root.left);

            Queue<TreeNode> rightQueue = new LinkedList<>();
            rightQueue.add(root.right);

            while (!leftQueue.isEmpty()) {
                Queue<TreeNode> newLeftQueue = new LinkedList<>();

                while (!leftQueue.isEmpty()) {
                    TreeNode poll = leftQueue.poll();
                    if (poll == null) {
                        newLeftQueue.add(null);
                        newLeftQueue.add(null);
                    } else {
                        newLeftQueue.add(poll.left);
                        newLeftQueue.add(poll.right);
                    }
                    nodeStack.add(poll);
                }
                leftQueue = newLeftQueue;
                Queue<TreeNode> newRightQueue = new LinkedList<>();
                while (!rightQueue.isEmpty()) {
                    TreeNode poll = rightQueue.poll();
                    if (poll == null) {
                        newRightQueue.add(null);
                        newRightQueue.add(null);
                    } else {
                        newRightQueue.add(poll.left);
                        newRightQueue.add(poll.right);
                    }

                    TreeNode pop = nodeStack.pop();
                    if (pop != null && poll != null && pop.val != poll.val) {
                        return false;
                    }
                }
                rightQueue = newRightQueue;
            }
            if (!rightQueue.isEmpty()) {
                return false;
            }
        }
        return true;
    }*/

    public boolean isDui(TreeNode left, TreeNode right) {
       /* if(left == null && right == null) return true;
        if(left!= null&& right != null){
            if (left.val != right.val) return false;

            if(left.left!= null && right.right == null) return false;
            if(left.left== null && right.right != null) return false;
            if(left.right!= null && right.left == null) return false;
            if(left.right== null && right.left != null) return false;

            if(left.left!= null){
                return isDui(left.left,right.right);
            }


        }
        return false;
        if (left.val != right.val) return false;


        if (left.left == null && right.right == null) {
            return true;
        }

        if (left.left != null && right.right != null) {
            return isDui(left.left, right.right);
        }

        if (left.right == null && right.left == null) {
            return true;
        }

        if (left.right != null && right.left != null) {
            return isDui(left.right, right.left);
        }*/

        return false;
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
