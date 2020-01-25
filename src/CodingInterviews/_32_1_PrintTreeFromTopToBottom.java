package CodingInterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 从上往下打印二叉树
public class _32_1_PrintTreeFromTopToBottom {

  public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    ArrayList<Integer> res = new ArrayList();
    if (root == null) return res;

    Queue<TreeNode> q = new LinkedList();
    q.offer(root);

    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      res.add(node.val);
      if (node.left != null) q.offer(node.left);
      if (node.right != null) q.offer(node.right);
    }
    return res;
  }
}
