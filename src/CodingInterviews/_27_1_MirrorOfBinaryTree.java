package CodingInterviews;

public class _27_1_MirrorOfBinaryTree {
    static void mirror(TreeNode root) {
        if (root == null) return;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirror(root.left);
        mirror(root.right);
    }

    public static void main(String[] args) {
    }
}
