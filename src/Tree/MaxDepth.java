package Tree;


public class MaxDepth {
    /*
     *   深度优先搜索
     * */
    public int maxDepth1(TreeNode root) {
        if (root == null) return 0;
        int leftHeight = maxDepth1(root.left);
        int rightHeight = maxDepth1(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    /*
    *   对称二叉树
    * */
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    /*
    *   反转二叉树
    * */
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}


