package CodingInterviews;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// leetcode 237
public class _32_2_PrintTreesInLines {

  public List<List<Integer>> levelOrder(TreeNode pRoot) {
    if (pRoot == null) return new ArrayList();

    List<List<Integer>> rst = new ArrayList();

    Queue<TreeNode> q = new LinkedList();
    q.offer(pRoot);
    int toBePrinted = 1;
    int nextLevel = 0;

    List<Integer> subRst = new ArrayList();
    while (!q.isEmpty()) {
      TreeNode node = q.poll();
      subRst.add(node.val);

      if (node.left != null) {
        q.offer(node.left);
        nextLevel++;
      }

      if (node.right != null) {
        q.offer(node.right);
        nextLevel++;
      }

      if (--toBePrinted == 0) {
        rst.add(subRst);
        subRst = new ArrayList();
        toBePrinted = nextLevel;
        nextLevel = 0;
      }
    }
    return rst;
  }
}
