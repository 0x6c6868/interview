package CodingInterviews;

public class _27_1_MirrorOfBinaryTree {

    public void mirror(TreeNode root) {
        if (root == null) return;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirror(root.left);
        mirror(root.right);
    }

}
