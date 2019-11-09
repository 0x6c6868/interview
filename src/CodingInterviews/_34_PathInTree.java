package CodingInterviews;

import java.util.ArrayList;
import java.util.List;

public class _34_PathInTree {
    static ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> rst = new ArrayList<>();
        if (root == null) return rst;

        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        findPathCore(root, target, root.val, path, rst);

        return rst;
    }

    static void findPathCore(TreeNode node, int target,
                             int currSum, List<Integer> path,
                             ArrayList<ArrayList<Integer>> rst) {
        if (node.left == null && node.right == null) {
            if (currSum == target) {
                ArrayList<Integer> newList = new ArrayList<>(path);
                rst.add(newList);
            }
            return;
        }

        if (node.left != null) {
            path.add(node.left.val);
            findPathCore(node.left, target, currSum + node.left.val, path, rst);
            path.remove(path.size() - 1);
        }

        if (node.right != null) {
            path.add(node.right.val);
            findPathCore(node.right, target, currSum + node.right.val, path, rst);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
    }
}
