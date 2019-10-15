package CodingInterviews.ch02;

import CodingInterviews.util.TreeNode;

public class ConstructBinaryTree {

    static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length <= 0 || in.length <= 0 || pre.length != in.length) throw new IllegalArgumentException();

        return reConstructCore(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }

    static TreeNode reConstructCore(int[] pre, int[] in,
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

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode node = reConstructBinaryTree(pre, in);
        System.out.println("build success");
    }
}
