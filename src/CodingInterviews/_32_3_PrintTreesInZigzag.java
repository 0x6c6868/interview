package CodingInterviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class _32_3_PrintTreesInZigzag {

  public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
    if (pRoot == null) return new ArrayList();

    ArrayList<ArrayList<Integer>> rst = new ArrayList();

    List<Stack<TreeNode>> s = Arrays.asList(new Stack<>(), new Stack<>());
    int curr = 0, next = 1;
    s.get(curr).push(pRoot);

    ArrayList<Integer> subRst = new ArrayList();
    while (!s.get(curr).isEmpty()) {
      TreeNode node = s.get(curr).pop();
      subRst.add(node.val);

      if (curr == 0) {
        if (node.left != null) s.get(next).push(node.left);
        if (node.right != null) s.get(next).push(node.right);
      } else {
        if (node.right != null) s.get(next).push(node.right);
        if (node.left != null) s.get(next).push(node.left);
      }

      if (s.get(curr).isEmpty()) {
        rst.add(subRst);
        subRst = new ArrayList();
        curr = 1 - curr;
        next = 1 - next;
      }
    }
    return rst;
  }
}
