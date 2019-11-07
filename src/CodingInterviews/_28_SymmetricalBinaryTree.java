package CodingInterviews;

public class _28_SymmetricalBinaryTree {
    static boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return isSymmetricalCore(pRoot.left, pRoot.right);
    }

    static boolean isSymmetricalCore(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;

        if (left.val != right.val) return false;

        return isSymmetricalCore(left.left, right.right) &&
                isSymmetricalCore(left.right, right.left);
    }

    public static void main(String[] args) {
    }
}
