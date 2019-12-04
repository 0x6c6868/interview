package CodingInterviews;

public class _27_1_MirrorOfBinaryTree {

    public void Mirror(TreeNode root) {
        if (root == null) return;

        TreeNode swap = root.left;
        root.left = root.right;
        root.right = swap;

        Mirror(root.left);
        Mirror(root.right);
    }

}
