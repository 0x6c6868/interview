package CodingInterviews;

// 二叉树的下一个结点
public class _08_NextNodeInBinaryTrees {

  public TreeLinkNode GetNext(TreeLinkNode pNode) {
    if (pNode == null) return null;

    if (pNode.right != null) {
      TreeLinkNode curr = pNode.right;
      while (curr.left != null) curr = curr.left;
      return curr;
    }

    while (pNode.next != null) {
      if (pNode.next.left == pNode) return pNode.next;
      pNode = pNode.next;
    }
    return null;
  }
}
