package CodingInterviews;

public class _07_ConstructBinaryTree {

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length <= 0 || in.length <= 0 || pre.length != in.length) throw new IllegalArgumentException();

        return reConstructCore(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    private TreeNode reConstructCore(int[] pre, int[] in,
                                     int preStart, int preEnd,
                                     int inStart, int inEnd) {

        int rootVal = pre[preStart];

        int rootInIndex = inStart;
        while (in[rootInIndex] != rootVal) rootInIndex++;

        int leftTreeSize = rootInIndex - inStart;
        int rightTreeSize = inEnd - rootInIndex;

        TreeNode node = new TreeNode(rootVal);

        if (leftTreeSize > 0) {
            TreeNode leftNode = reConstructCore(pre, in, preStart + 1, preStart + leftTreeSize, inStart, rootInIndex - 1);
            node.left = leftNode;
        }

        if (rightTreeSize > 0) {
            TreeNode rightNode = reConstructCore(pre, in, preStart + leftTreeSize + 1, preEnd, rootInIndex + 1, inEnd);
            node.right = rightNode;
        }

        return node;
    }

}
