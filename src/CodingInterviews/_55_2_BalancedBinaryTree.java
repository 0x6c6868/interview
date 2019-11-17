package CodingInterviews;

public class _55_2_BalancedBinaryTree {

    static class Context {
        boolean isBalanced;
        int depth;
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;

        Context c = IsBalancedCore(root);
        return c.isBalanced;
    }

    private Context IsBalancedCore(TreeNode curr) {
        Context context = new Context();
        if (curr == null) {
            context.isBalanced = true;
            context.depth = 0;
            return context;
        }

        Context leftContext = IsBalancedCore(curr.left);
        if (!leftContext.isBalanced) return leftContext;

        Context rightContext = IsBalancedCore(curr.right);
        if (!rightContext.isBalanced) return rightContext;

        int depthDiff = leftContext.depth - rightContext.depth;
        if (depthDiff > 1 || depthDiff < -1) {
            context.isBalanced = false;
        } else {
            context.isBalanced = true;
            context.depth = leftContext.depth > rightContext.depth ?
                    leftContext.depth + 1 : rightContext.depth + 1;
        }
        return context;
    }

}
