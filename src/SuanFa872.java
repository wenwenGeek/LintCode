import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa872 {


    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        List<Integer> a1 = getYezi(root1);
        List<Integer>  a2 = getYezi(root2);

        if(a1.size() != a2.size()) return false;

        for (int i = 0; i < a1.size(); i++) {
            if(!a1.get(i).equals(a2.get(i))) return false;
        }
        return true;
    }

    public List<Integer> getYezi(TreeNode node){
        Stack<TreeNode> nodes = new Stack<>();
        List<Integer> integers = new ArrayList<>();
        nodes.push(node);
        while (!nodes.isEmpty()){
            TreeNode n = nodes.pop();

            if(n.left==null && n.right == null){
                integers.add(n.val);
                continue;
            }

            if(n.right != null){
                nodes.push(n.right);
            }
            if(n.left != null){
                nodes.push(n.left);
            }
        }
        return integers;
    }

}
