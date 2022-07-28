package Tree;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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


    /*
    *   路经总和
    * */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        Queue<TreeNode> queNodes = new LinkedList<>();
        Queue<Integer> queVal = new LinkedList<>();
        queNodes.offer(root);
        queVal.offer(root.val);

        while (!queNodes.isEmpty()) {
            TreeNode now = queNodes.poll();
            int temp = queVal.poll();
            if (now.left == null && now.right == null) {
                if (temp == targetSum) return true;
                continue;
            }
            if (now.left != null) {
                queNodes.offer(now.left);
                queVal.offer(now.left.val + temp);
            }

            if (now.right != null) {
                queNodes.offer(now.right);
                queVal.offer(now.right.val + temp);
            }
        }
        return false;
    }

    /*
    *   展平二叉树
    * */

    public TreeNode increasingBST(TreeNode root) {

        LinkedList<Integer> list = new LinkedList<>();

        inorder(root, list);

        TreeNode node = new TreeNode();
        TreeNode res = node;

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            node.right = new TreeNode(iterator.next());
            node = node.right;
        }

        return res.right;
    }

    public void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    /*
    *   二叉搜索树中的搜索
    * */
    public TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) return root;
            else if (root.val > val) root = root.left;
            else root = root.right;
        }

        return null;
    }


}


