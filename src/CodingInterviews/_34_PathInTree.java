package CodingInterviews;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class _34_PathInTree {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList();
        if (root == null) return rst;
        ArrayList<TreeNode> path = new ArrayList();
        Core(root, target, rst, path, 0);
        return rst;
    }

    public void Core(TreeNode node, int target, ArrayList<ArrayList<Integer>> rst, ArrayList<TreeNode> path, int sum) {
        path.add(node);
        sum += node.val;
        if (node.left == null && node.right == null) {
            if (sum == target) {
                rst.add((ArrayList) path.stream().map(it -> it.val).collect(Collectors.toList()));
            }
        }

        if (node.left != null) Core(node.left, target, rst, path, sum);
        if (node.right != null) Core(node.right, target, rst, path, sum);

        path.remove(path.size() - 1);
        return;
    }

}
