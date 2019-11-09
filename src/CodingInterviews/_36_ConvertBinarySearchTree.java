package CodingInterviews;

public class _36_ConvertBinarySearchTree {
    static TreeNode convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        return convertCore(pRootOfTree);
    }

    static TreeNode convertCore(TreeNode node) {
        TreeNode leftNode = node;

        if (node.left != null) {
            leftNode = convertCore(node.left);

            TreeNode lastLeftNode = leftNode;
            while (lastLeftNode.right != null) lastLeftNode = lastLeftNode.right;

            lastLeftNode.right = node;
            node.left = lastLeftNode;
        }
        if (node.right != null) {
            TreeNode rightNode = convertCore(node.right);

            node.right = rightNode;
            rightNode.left = node;
        }
        return leftNode;
    }

    public static void main(String[] args) {
    }
}
