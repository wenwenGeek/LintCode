/**
 * SuanFa55
 *
 * @Author bowen.cui
 * @Date 2020/5/8 21:47
 **/
public class SuanFa101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        if (root.left != null && root.right != null) {
            return isDui(root.left, root.right);
        }
        return false;
    }

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

}
