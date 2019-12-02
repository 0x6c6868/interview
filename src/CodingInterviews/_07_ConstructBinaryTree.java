package CodingInterviews;

public class _07_ConstructBinaryTree {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0) return null;
        return core(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    public TreeNode core(int[] pre, int[] in, int preStart, int preEnd,
                         int inStart, int inEnd) {
        TreeNode root = new TreeNode(pre[preStart]);

        int inRootIndex = 0;
        for (inRootIndex = inStart; inRootIndex <= inEnd; inRootIndex++) {
            if (in[inRootIndex] == root.val) break;
        }

        if (inRootIndex != inStart) {
            TreeNode left = core(pre, in,
                    preStart + 1, preStart + inRootIndex - inStart,
                    inStart, inRootIndex - 1);
            root.left = left;
        }

        if (inRootIndex != inEnd) {
            TreeNode right = core(pre, in,
                    preStart + inRootIndex - inStart + 1, preEnd,
                    inRootIndex + 1, inEnd);
            root.right = right;
        }
        return root;
    }

}
