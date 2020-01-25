package CodingInterviews;

// 二叉树的镜像
public class _27_MirrorOfBinaryTree {

  public void Mirror(TreeNode root) {
    if (root == null) return;

    TreeNode swap = root.left;
    root.left = root.right;
    root.right = swap;

    Mirror(root.left);
    Mirror(root.right);
  }
}
