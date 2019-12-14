package CodingInterviews;

public class _07_ConstructBinaryTree {

  public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
    if (pre == null || in == null) return null;
    return buildCore(pre, 0, pre.length - 1, in, 0, in.length - 1);
  }

  private TreeNode buildCore(
      int[] pre, int startPre, int endPre, int[] in, int startIn, int endIn) {

    if (startPre > endPre || startIn > endIn) return null;

    TreeNode root = new TreeNode(pre[startPre]);
    for (int i = startIn; i <= endIn; i++)
      if (in[i] == pre[startPre]) {
        root.left = buildCore(pre, startPre + 1, startPre + i - startIn, in, startIn, i - 1);
        root.right = buildCore(pre, i - startIn + startPre + 1, endPre, in, i + 1, endIn);
        break;
      }

    return root;
  }
}
