package CodingInterviews;

public class _26_SubstructureInTree {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return false;
        if (root1 == null) return false;
        return HasSubtreeCore(root1, root2);
    }

    public boolean HasSubtreeCore(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;

        if (root1.val == root2.val) {
            boolean flag = HasSubtreeCore(root1.left, root2.left) &&
                    HasSubtreeCore(root1.right, root2.right);
            if (flag) return true;
        }

        return HasSubtreeCore(root1.left, root2) || HasSubtreeCore(root1.right, root2);
    }

}
