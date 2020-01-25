package CodingInterviews;

// 对称的二叉树
public class _28_SymmetricalBinaryTree {

  boolean isSymmetrical(TreeNode pRoot) {
    if (pRoot == null) return true;
    return isSymmetrical(pRoot.left, pRoot.right);
  }

  boolean isSymmetrical(TreeNode left, TreeNode right) {
    if (left == null) return right == null;
    if (right == null) return false;
    if (left.val != right.val) return false;
    return isSymmetrical(left.left, right.right) && isSymmetrical(left.right, right.left);
  }
}
