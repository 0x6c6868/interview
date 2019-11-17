package CodingInterviews;

public class _54_KthNodeInBST {

    private int k;

    public TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null || k <= 0) return null;

        this.k = k;

        return KthNodeCore(pRoot);
    }

    private TreeNode KthNodeCore(TreeNode curr) {
        if (curr == null || k <= 0) return null;

        TreeNode kNode = KthNodeCore(curr.left);
        if (kNode != null) return kNode;

        if (curr != null && k == 1) {
            return curr;
        }
        k -= 1;

        return KthNodeCore(curr.right);
    }

}
