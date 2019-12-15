package CodingInterviews;

import java.util.ArrayList;

public class _34_PathInTree {

  private final ArrayList<ArrayList<Integer>> res = new ArrayList<>();
  private final ArrayList<Integer> list = new ArrayList<>();

  public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
    if (root == null) return res;
    list.add(root.val);

    target -= root.val;
    if (target == 0 && root.left == null && root.right == null) res.add(new ArrayList<>(list));

    FindPath(root.left, target);
    FindPath(root.right, target);
    list.remove(list.size() - 1);

    return res;
  }
}
