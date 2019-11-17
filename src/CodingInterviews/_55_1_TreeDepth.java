package CodingInterviews;

public class _55_1_TreeDepth {

    public int TreeDepth(TreeNode root) {
        if (root == null) return 0;

        int leftDepth = TreeDepth(root.left);
        int rightDepth = TreeDepth(root.right);

        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }

}
