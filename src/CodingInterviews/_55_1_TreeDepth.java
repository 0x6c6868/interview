package CodingInterviews;

// 二叉树的深度
public class _55_1_TreeDepth {

  public int TreeDepth(TreeNode root) {
    if (root == null) return 0;
    return Math.max(TreeDepth(root.left) + 1, TreeDepth(root.right) + 1);
  }
}
