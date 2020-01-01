package CodingInterviews;

public class _36_ConvertBinarySearchTree {

  private TreeNode prev = null;

  public TreeNode Convert(TreeNode pRootOfTree) {
    if (pRootOfTree == null) return null;

    ConvertCore(pRootOfTree);

    TreeNode rst = pRootOfTree;
    while (rst.left != null) rst = rst.left;
    return rst;
  }

  private void ConvertCore(TreeNode curr) {
    if (curr == null) return;

    ConvertCore(curr.left);

    curr.left = prev;
    if (prev != null) prev.right = curr;
    prev = curr;

    ConvertCore(curr.right);
  }
}
