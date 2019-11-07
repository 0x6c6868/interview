package CodingInterviews;


import java.util.ArrayDeque;
import java.util.Queue;

public class _26_SubstructureInTree {

    static boolean hasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;

        Queue<TreeNode> q = new ArrayDeque();
        q.offer(root1);
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (isSameTree(curr, root2)) return true;

            if (curr.left != null) q.offer(curr.left);
            if (curr.right != null) q.offer(curr.right);
        }

        return false;
    }

    static boolean isSameTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;

        if (root1 == null) return false;

        if (root1.val == root2.val)
            return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
        else
            return false;
    }

    public static void main(String[] args) {
    }
}
