package CodingInterviews;

// 树的子结构
public class _26_SubstructureInTree {

  public boolean HasSubtree(TreeNode root1, TreeNode root2) {
    if (root1 == null || root2 == null) return false;
    return IsSubtree(root1, root2)
        || HasSubtree(root1.left, root2)
        || HasSubtree(root1.right, root2);
  }

  public boolean IsSubtree(TreeNode root1, TreeNode root2) {
    if (root2 == null) return true;
    if (root1 == null) return false;

    return root1.val == root2.val
        && IsSubtree(root1.left, root2.left)
        && IsSubtree(root1.right, root2.right);
  }
}
