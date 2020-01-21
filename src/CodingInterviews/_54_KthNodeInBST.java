package CodingInterviews;

public class _54_KthNodeInBST {

  private int index;

  public TreeNode KthNode(TreeNode pRoot, int k) {
    if (pRoot == null) return null;

    TreeNode node = KthNode(pRoot.left, k);
    if (node != null) return node;

    if (++index == k) return pRoot;

    return KthNode(pRoot.right, k);
  }
}
